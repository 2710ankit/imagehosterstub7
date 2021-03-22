package ImageHoster.model;

import javax.persistence.*;

@Entity
@Table(name = "userProfile")
public class UserProfile {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "userId")
    private Integer id;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "emailAddress")
    private String emailAddress;

    @Column(name = "mobileNumber")
    private String mobileNumber;

    public UserProfile() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
