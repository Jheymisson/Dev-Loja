package com.estudo.enums;

public enum TipoCliente {

    PESSOAFISICA(1, "PESSOA FÍSICA"),
    PESSOAJURIDICA(2, "PESSOA JURÍDICA");

    private int cod;
    private String descricao;

    TipoCliente(int cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public int getCod(){
        return cod;
    }

    public String getDecricao(){
        return descricao;
    }

    public static TipoCliente toEnum(Integer cod){
       if(cod == null){
           return null;
       }

       for(TipoCliente x : TipoCliente.values()){
           if(cod.equals(x.getCod())){
               return x;
           }
       }

       throw new IllegalArgumentException("Id inválido" + cod);
    }


}
