package api.sales.models;

import javax.persistence.*;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "sales")
@AllArgsConstructor
@NoArgsConstructor
public class Sale {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_sale;
    @Column(nullable = false)
    private Integer id_employee;
    @Column(nullable = false)
    private Integer id_branch_office;
    @Column(nullable = false)
    private Double total_sale;
    @Column(nullable = false)
    private String description;
    //@Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private String date_sale;
    @Column(nullable = false)
    private String name_employee;
    //Datos de la sucursal
    @Column(nullable = false)
    private String name_branch_office;
    @Column(nullable = false)
    private String state_branch_office;
    @Column(nullable = false)
    private String city_branch_office;
    @Column(nullable = false)
    private String street_branch_office;
    @Column(nullable = false)
    private Integer number_branch_office;
    @Column(nullable = false)
    private Integer zip_code_branch_office;
    @Column(nullable = false)
    private String folio;

    @Override
    public String toString(){
        return 
                "{\"id_sale\": "+this.id_sale+", "+
                "\"id_employee\": "+this.id_employee+", "+
                "\"id_branch_office\": "+this.id_branch_office+", "+
                "\"name_branch_office\": \""+this.name_branch_office+"\", "+
                "\"total_sale\": "+this.total_sale+", "+
                "\"description\": \""+this.description+"\", "+
                "\"date_sale\": \""+this.date_sale+"\", "+
                "\"name_employee\": \""+this.name_employee+"\", "+
                "\"state_branch_office\": \""+this.state_branch_office+"\", "+
                "\"city_branch_office\": \""+this.city_branch_office+"\", "+
                "\"street_branch_office\": \""+this.street_branch_office+"\", "+
                "\"number_branch_office\": "+this.number_branch_office+", "+
                "\"zip_code_branch_office\": "+this.zip_code_branch_office+", "+
                "\"folio\": \""+this.folio+"\" "+"}";
    }

}
