import com.contactbook.model.Contact;

public class ContactTestUtil {

    public static Contact createModelObject(String name, String lastName) {
        Contact model = new Contact();
        model.setName(name);
        model.setLastName(lastName);

        return model;
    }
}
