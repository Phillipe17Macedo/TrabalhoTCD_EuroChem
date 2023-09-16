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
    private String numeroFornecedor;
    
    public Fornecedor(String nomeFornecedor, String numFornecedor){
        this.nameFornecedor = nomeFornecedor;
        this.numeroFornecedor = numFornecedor;
    }

    public String getNameFornecedor() {
        return nameFornecedor;
    }

    public String getNumeroFornecedor() {
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
        return numeroFornecedor.equals(fornecedores.numeroFornecedor) && nameFornecedor.equals(fornecedores.nameFornecedor);
    }    
}
