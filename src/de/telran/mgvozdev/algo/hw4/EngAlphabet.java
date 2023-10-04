package de.telran.mgvozdev.algo.hw4;

public enum EngAlphabet {

    A(1), B(2), C(3), D(4), E(5), F(6), G(7), H(8), I(9),
    J(10), K(11), L(12), M(13), N(14), O(15), P(16), Q(17), R(18),
    S(19), T(20), U(21), V(22), W(23), X(24), Y(25), Z(26),
    a(27), b(28), c(29), d(30), e(31), f(32), g(33), h(34), i(35),
    j(36), k(37), l(38), m(39), n(40), o(41), p(42), q(43), r(44),
    s(45), t(46), u(47), v(48), w(49), x(50), y(51), z(52);

    final Integer serialNumber;

    EngAlphabet(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public static String getEncryptedValue(int serialNumber, int secretKey) {
        int temp = serialNumber + secretKey;
        if (temp > 52) {
            return getLetterBySerialNumber(temp - 52);
        } else {
            return getLetterBySerialNumber(temp);
        }
    }

    public static String getDecryptedValue(int serialNumber, int secretKey) {
        int temp = serialNumber - secretKey;
        if (temp < 0) {
            return getLetterBySerialNumber(temp + 52);
        } else {
            return getLetterBySerialNumber(temp);
        }
    }

    public static String getLetterBySerialNumber(Integer serialNumber) {
        String letter = null;
        for (EngAlphabet value : EngAlphabet.values()) {
            if (value.getSerialNumber() == serialNumber) {
                letter = value.toString();
            }
        }
        return letter;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }
}
