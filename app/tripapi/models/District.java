    
package tripapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import play.db.ebean.Model;

@Entity
@Table(name = "district")
public class District extends Model {


	private static final long serialVersionUID = 1L;

	@Id
    @Column
    public Long id_dist;

    @Column
    public String district_name;
    
    @Column
    public String dist_info;

}