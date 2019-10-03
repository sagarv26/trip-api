package tripapi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import play.db.ebean.Model;

@Entity
@Table(name = "place_values")
public class PlaceValues extends Model {

	@Id
    @Column
    public Long id_place;
	
	@Column
    public String best_season;

    @Column
    public String near_by_place;

    @Column
    public String image;
	
}