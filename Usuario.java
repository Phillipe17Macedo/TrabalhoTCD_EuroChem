/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadEuroChem;
/**
 *
 * @author phsto
 */
public class Usuario {
    private String Name;
    //private String Email;
    private String Password;
    
    public Usuario(String name, String password) {
        this.Name = name;
        //EM CASO DE USAR O EMAIL NA VERIFICAÇÃO
        //this.Email = email;
        this.Password = password;
    }
    public String getName() {
        return Name;
    }
/*
    public String getEmail() {
        return Email;
    }
*/
    public String getPassword() {
        return Password;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Usuario usuario = (Usuario) obj;
        return Name.equals(usuario.Name) && Password.equals(usuario.Password);
    }    
}
