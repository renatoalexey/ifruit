package br.com.renatoalexey.ifruit;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

/**
 * Created by renato on 27/05/16.
 */
public enum Fruta {
    ABACATE ("Abacate Breda", Arrays.asList(8, 9, 10), Arrays.asList(11) ),
    ABACATE_GEADA ("Abacate Geada", Arrays.asList(0, 1), null ),
    ABACATE_FORTUNA ("Abacate Fortuna", Arrays.asList(2, 3, 4, 5, 6, 7), null ),
    ABACAXI_HAVAI  ("Abacaxi Havaí ", Arrays.asList(0, 11), Arrays.asList(1, 10) ),
    ABACAXI_PEROLA  ("Abacaxi Pérola ", Arrays.asList(10, 11), Arrays.asList(2, 3, 4, 9) ),
    ABIU ("Abiu", Arrays.asList(2, 3, 7, 8), Arrays.asList(0, 1, 4, 6, 9) ),
    ACEROLA ("Acerola", Arrays.asList(8, 9, 10, 11), Arrays.asList(0, 1, 2, 3, 4) ),
    AMEIXA_ESTRANGEIRA ("Ameixa Estrangeira", Arrays.asList(1, 2, 3, 11), Arrays.asList(0, 9) ),
    AMEIXA_NACIONAL ("Ameixa Nacional", Arrays.asList(11), Arrays.asList(0, 10) ),
    AMENDOA ("Amêndoa", Arrays.asList(1, 11), Arrays.asList(8, 10) ),
    ATEMOIA ("Atemoia", Arrays.asList(3, 4, 5, 6, 7), Arrays.asList(2, 8, 9) ),
    AVELA ("Avelã", Arrays.asList(11), null ),
    BANANA ("Banana", Arrays.asList(2, 7, 9, 10), Arrays.asList(4, 8) ),
    BANANA_MACA ("Banana Maçã", Arrays.asList(2, 3, 4), Arrays.asList(0, 1, 5, 6, 7) ),
    BANANA_NANICA ("Banana Nanica", Arrays.asList(2, 7, 8, 9, 10), null ),
    BANANA_PRATA ("Banana Prata", Arrays.asList(9, 10, 11), Arrays.asList(2, 4, 7, 8) ),
    CAJU ("Caju", Arrays.asList(7, 8, 9, 10), Arrays.asList(0, 5, 6, 11) ),
    CAQUI ("Caqui", Arrays.asList(3, 4), Arrays.asList(2, 5) ),
    CARAMBOLA ("Carambola", Arrays.asList(0, 1, 5, 6, 7), Arrays.asList(2, 3, 4, 8, 11) ),
    CASTANHA ("Castanha", Arrays.asList(11), Arrays.asList(10) ),
    CEREJA_ESTRANGEIRA ("Cereja Estrangeira", Arrays.asList(11), Arrays.asList(0) ),
    CIDRA ("Cidra", Arrays.asList(3), Arrays.asList(2, 7, 8, 11) ),
    COCO_VERDE ("Côco Verde", Arrays.asList(0, 1, 2, 9, 10, 11), Arrays.asList(8) ),
    DAMASCO_ESTRANGEIRO ("Damasco Estrangeiro", Arrays.asList(11), null ),
    FIGO ("Figo", Arrays.asList(0, 1, 2, 11), Arrays.asList(3) ),
    FRAMBOESA ("Framboesa", Arrays.asList(0, 10, 11), Arrays.asList(1, 2) ),
    FRUTA_CONDE ("Fruta do Conde/Pinha", Arrays.asList(0, 1, 2), Arrays.asList(3, 4) ),
    GOIABA ("Goiaba", Arrays.asList(1, 2), Arrays.asList(0, 3, 7, 8, 9) ),
    GRAVIOLA ("Graviola", Arrays.asList(11), Arrays.asList(2, 3, 10) ),
    GRAPEFRUIT ("Grapefruit", Arrays.asList(6, 8, 10), Arrays.asList(4, 5, 9) ),
    JABUTICABA ("Jabuticaba", Arrays.asList(8, 9), null ),
    JACA ("Jaca", Arrays.asList(1, 2, 3, 4, 10), Arrays.asList(0, 5, 9, 11) ),
    KIWI_NACIONAL ("Kiwi Nacional", Arrays.asList(3, 4, 5, 6, 7), Arrays.asList(8, 9) ),
    KIWI_ESTRANGEIRO ("Kiwi Estrangeiro", Arrays.asList(7, 11), Arrays.asList(4, 6, 8, 10) ),
    LARANJA ("Laranja", Arrays.asList(7, 8, 9), Arrays.asList(0, 1, 2, 6, 10, 11) ),
    LARANJA_LIMA ("Laranja Lima", Arrays.asList(5, 6, 7, 8), Arrays.asList(3, 4, 9) ),
    LARANJA_PERA ("Laranja Pêra", Arrays.asList(0, 1, 2, 7, 8, 9, 10, 11), null ),
    LICHIA ("Lichia", Arrays.asList(11), Arrays.asList(10) ),
    LIMA_PERSIA ("Lima da Pérsia", Arrays.asList(7, 9), Arrays.asList(2, 3, 6, 8, 10) ),
    LIMAO ("Limão", Arrays.asList(2, 11), Arrays.asList(0, 1, 3) ),
    LIMAO_TAITI ("Limão Taiti", Arrays.asList(2, 11), Arrays.asList(0, 1, 3) ),
    MACA_NACIONAL ("Maçã Nacional", Arrays.asList(1, 2, 3, 4, 7), Arrays.asList(5, 6, 8, 9) ),
    MACA_NACIONAL_FUJI ("Maçã Nacional Fuji", Arrays.asList(8, 9, 10, 11), Arrays.asList(0, 6, 7) ),
    MACA_NACIONAL_GALA ("Maçã Nacional Gala", Arrays.asList(1, 2, 3, 4), Arrays.asList(5, 6, 7, 8) ),
    MACA_ESTRANGEIRA ("Maçã Estrangeira", Arrays.asList(10, 11), Arrays.asList(0, 6, 7, 8, 9) ),
    MACA_GRANNY_SMITH ("Maçã Granny Smith", Arrays.asList(11), Arrays.asList(9) ),
    MACA_RED_DEL ("Maçã Red Del", Arrays.asList(9, 10, 11), Arrays.asList(0, 6, 7, 8) ),
    MAMAO_FORMOSA ("Mamão Formosa", Arrays.asList(2, 3, 7), Arrays.asList(4, 5, 8, 9) ),
    MAMAO_HAVAI ("Mamão Havaí", Arrays.asList(0, 2, 9, 10), Arrays.asList(1, 3, 8, 11) ),
    MANGA ("Manga", Arrays.asList(9, 10, 11), Arrays.asList(0, 8) ),
    MANGOSTAO ("Mangostão", Arrays.asList(2, 5), Arrays.asList(6) ),
    MARACUJA ("Maracujá", Arrays.asList(0, 10, 11), Arrays.asList(2, 3, 7, 8, 9) ),
    MARMELO_NACIONAL ("Marmelo Nacional", Arrays.asList(0), Arrays.asList(1, 11) ),
    MARMELO_ESTRANGEIRO ("Marmelo Estrangeiro", Arrays.asList(5), Arrays.asList(3, 4) ),
    MELANCIA ("Melancia", Arrays.asList(0, 10, 11), Arrays.asList(1, 2, 3, 9) ),
    MELAO_AMARELO ("Melão Amarelo", Arrays.asList(10, 11), Arrays.asList(0, 8, 9) ),
    MEXERICA ("Mexerica", Arrays.asList(5, 6, 7, 8), Arrays.asList(4, 9) ),
    MORANGO ("Morango", Arrays.asList(7), Arrays.asList(5, 6, 8, 9) ),
    NECTARINA_NACIONAL ("Nectarina Nacional", Arrays.asList(10, 11), Arrays.asList(9) ),
    NECTARINA_ESTRANGEIRA ("Nectarina Estrangeira", Arrays.asList(0, 2, 11), Arrays.asList(1, 7) ),
    NESPERA ("Nêspera", Arrays.asList(8, 9), Arrays.asList(6, 7) ),
    NOZES ("Nozes", Arrays.asList(10, 11), null ),
    PERA_NACIONAL ("Pêra Nacional", Arrays.asList(1, 2), Arrays.asList(0, 3) ),
    PERA_ESTRANGEIRA ("Pêra Estrangeira", Arrays.asList(2, 3, 4), Arrays.asList(1, 5, 6, 8) ),
    PESSEGO_NACIONAL ("Pêssego Nacional", Arrays.asList(10, 11), Arrays.asList(0, 9) ),
    PESSEGO_ESTRANGEIRO ("Pêssego Estrangeiro", Arrays.asList(1, 2, 11), Arrays.asList(0, 6, 10) ),
    QUINCAM ("Quincam", Arrays.asList(4, 5, 6, 7), Arrays.asList(2, 3, 8, 9) ),
    ROMA ("Romã", Arrays.asList(11), Arrays.asList(0) ),
    SERIGUELA ("Seriguela", Arrays.asList(1, 2), null ),
    TAMARINDO ("Tamarindo", Arrays.asList(8), Arrays.asList(7, 9) ),
    TANGERINA_CRAVO ("Tangerina Cravo", Arrays.asList(2, 3), Arrays.asList(4) ),
    TANGERINA_MURCOTE ("Tangerina Murcote", Arrays.asList(7, 8, 9, 10), Arrays.asList(0, 11) ),
    TANGERINA_PONCAM ("Tangerina Poncam", Arrays.asList(4, 5, 6, 7), Arrays.asList(3) ),
    UVA_ITALIA ("Uva Itália", Arrays.asList(1, 2, 11), Arrays.asList(0) ),
    UVA_NIAGARA ("Uva Niagara", Arrays.asList(11), Arrays.asList(0) ),
    UVA_RUBI ("Uva Rubi", Arrays.asList(0, 1, 2, 11), Arrays.asList(3, 4, 5) ),
    UVA_ESTRANGEIRA ("Uva Estrangeira", Arrays.asList(2, 3, 4), Arrays.asList(1) );

    private String nome;
    private List<Integer> meses;
    private List<Integer> mesesMedio;
    private Fruta(String nome, List<Integer> meses, List<Integer> mesesMedio) {
        this.nome = nome;
        this.meses = meses;
        this.mesesMedio = mesesMedio;
    }

    public String getNome() {
        return nome;
    }

    public List<Integer> getMeses() {
        return meses;
    }

    public List<Integer> getMesesMedio() {
        return mesesMedio;
    }

    public static Fruta buscaFrutaPeloNome(String nome) {
        for (Fruta fruta : Fruta.values()) {
            if(fruta.getNome().equals(nome)) return fruta;
        }
        return null;
    }
}
