/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaas;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Table;
import javax.persistence.Entity;

/**
 *
 * @author Vane
 */
@Entity
@Table(name = "habitacio", catalog = "practicaas")
public class Habitacio  implements Serializable {
    
    @EmbeddedId
    CompoundKeyHabitacio compoundkey = new CompoundKeyHabitacio();
}
