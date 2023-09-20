/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadEuroChem;

/**
 *
 * @author phsto
 */
public class Fornecedor {
    private String nameFornecedor;
    private int numeroFornecedor;
    
    public Fornecedor(String nomeFornecedor, int numFornecedor){
        this.nameFornecedor = nomeFornecedor;
        this.numeroFornecedor = numFornecedor;
    }

    public String getNameFornecedor() {
        return nameFornecedor;
    }

    public int getNumeroFornecedor() {
        return numeroFornecedor;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Fornecedor fornecedores = (Fornecedor) obj;
        return numeroFornecedor == fornecedores.numeroFornecedor && nameFornecedor.equals(fornecedores.nameFornecedor);
    }    
}
