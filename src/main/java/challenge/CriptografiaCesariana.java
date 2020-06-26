package challenge;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {
        if (!texto.equals("")) {//verificar se o texto é nulo
            StringBuilder criptografado = new StringBuilder(); //StringBuilder para gerar a string criptografada
            for (char caracter : texto.toLowerCase().toCharArray()){//converte o texto para letras minúsculas e em array de char
                if (Character.isLetter(caracter))//vderifica se há somente letras
                    if (caracter != ' '){//verifica se há espaços
                        int originalASCII = caracter - 'a';//pega o código ASCII do char - o código do caracter 'a'
                        int novoASCII = (originalASCII + 3) %26;//gera um novo ASCII de acordo com a chave informada
                        char novoCaracter = (char)('a' + novoASCII);//busca o ASCII gerado e pega o no caracter
                        criptografado.append(novoCaracter);//adiciona o novo caracter na string
                    }else{
                        criptografado.append(caracter);//se houver espaço ele é adicionado
                }else{
                    criptografado.append(caracter);//se houver números ou caracteres especiais eles são adicionados na string
                }
            }
            return criptografado.toString();
        } else {
            throw new IllegalArgumentException();
        }
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
    }
}