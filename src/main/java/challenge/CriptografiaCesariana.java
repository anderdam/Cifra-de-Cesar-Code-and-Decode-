package challenge;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {
        if (!texto.equals("")) {
            StringBuilder criptografado = new StringBuilder();
            for (char caracter : texto.toLowerCase().toCharArray()){
                if (Character.isLetter(caracter))
                    if (caracter != ' '){
                        int originalASCII = caracter - 'a';
                        int novoASCII = (originalASCII + 3) %26;
                        char novoCaracter = (char)('a' + novoASCII);
                        criptografado.append(novoCaracter);
                    }else{
                        criptografado.append(caracter);
                }else{
                    criptografado.append(caracter);
                }
            }
            return criptografado.toString();
        } else {
            throw new IllegalArgumentException();
        }
        //throw new UnsupportedOperationException("esse method nao esta implementado ainda");
    }

    @Override
    public String descriptografar(String texto) {
        if (!texto.equals("")) {
            StringBuilder descriptografado = new StringBuilder();
            for (char caracter : texto.toLowerCase().toCharArray()){
                if (Character.isLetter(caracter)) {
                    if (caracter != ' ') {
                        int originalASCII = caracter - 'a';
                        int novoASCII = (originalASCII - 3) % 26;
                        char novoCaracter = (char) ('a' + novoASCII);
                        descriptografado.append(novoCaracter);
                    } else {
                        descriptografado.append(caracter);
                    }
                }else{
                    descriptografado.append(caracter);
                }
            }
            return descriptografado.toString();
        } else {
            throw new IllegalArgumentException();
        }

        //throw new UnsupportedOperationException("esse method nao esta implementado ainda");
    }
}
