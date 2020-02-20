package entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Document(indexName = "persons",type="person")
public class Person {
    @Id
    private String id;
    @Field(name="name",type= FieldType.Text)
    private String name;
    @Field(name="vorname",type= FieldType.Text)
    private String vorname;
    @Field(name="adress",type= FieldType.Text)
    private String adress;
    @Field(name="geburst_datum",type= FieldType.Date)
    private Date geburstdatum;
}
