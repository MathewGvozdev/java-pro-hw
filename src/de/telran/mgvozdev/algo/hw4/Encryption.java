package de.telran.mgvozdev.algo.hw4;

public class Encryption {

    public static void main(String[] args) {
        String password = "MAMA MYLA RAMU";
        System.out.println(password);

        int secretKey = 16;
        String encryption = encrypt(password, secretKey);
        System.out.println(encryption);

        String decryption = decrypt(encryption, secretKey);
        System.out.println(decryption);
    }

    public static String encrypt(String password, int secretKey) {
        StringBuilder encryptedPassword = new StringBuilder();
        char[] passwordSymbols = password.toCharArray();
        for (char symbol : passwordSymbols) {
            int symbolNumber;
            symbolNumber = getSymbolNumber(symbol);
            if (symbolNumber == -1) {
                encryptedPassword.append("$");
            } else if (symbolNumber % secretKey == 0) {
                String encryptedValue = EngAlphabet.getEncryptedValue(symbolNumber, secretKey);
                encryptedPassword.append(encryptedValue);
                encryptedPassword.append(0);
            } else {
                String encryptedValue = EngAlphabet.getEncryptedValue(symbolNumber, secretKey);
                encryptedPassword.append(encryptedValue);

                int modulo = symbolNumber % secretKey;
                if (modulo > 0 && modulo <= 9) {
                    encryptedPassword.append(modulo);
                } else {
                    encryptedPassword.append(EngAlphabet.getLetterBySerialNumber(modulo - 9));
                }
            }
        }
        return encryptedPassword.toString();
    }

    public static String decrypt(String encryption, int secretKey) {
        StringBuilder decryptedPassword = new StringBuilder();
        char[] encryptedSymbols = encryption.toCharArray();
        for (int i = 0; i < encryptedSymbols.length; i = i + 2) {
            if (encryptedSymbols[i] == '$') {
                decryptedPassword.append(" ");
                i--;
            } else {
                int firstSymbolNumber = getSymbolNumber(encryptedSymbols[i]);
                String decryptedValue = EngAlphabet.getDecryptedValue(firstSymbolNumber, secretKey);
                Integer symbolNumber = EngAlphabet.valueOf(decryptedValue).getSerialNumber();
                if (Character.isDigit(encryptedSymbols[i + 1])) {
                    decryptedPassword.append(EngAlphabet.getLetterBySerialNumber(symbolNumber));
                } else {
                    symbolNumber = EngAlphabet.valueOf(String.valueOf(encryptedSymbols[i + 1])).getSerialNumber() + 9;
                    decryptedPassword.append(EngAlphabet.getLetterBySerialNumber(symbolNumber));
                }
            }
        }
        return decryptedPassword.toString();
    }

    private static int getSymbolNumber(char ch) {
        int symbolNumber;
        try {
            symbolNumber = EngAlphabet.valueOf(String.valueOf(ch)).getSerialNumber();
        } catch (IllegalArgumentException e) {
            symbolNumber = -1;
        }
        return symbolNumber;
    }
}
