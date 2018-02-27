package com.mycompany.masterserenityjbehave.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.*;

import com.mycompany.masterserenityjbehave.steps.serenity.EndUserSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;

    @Given("Pengguna berada pada Homepage e-LOK")
    public void penggunaBeradaPadaHomepage() {
        endUser.beradaDiHomepage();
    }

    @Given("Pengguna berada pada Halaman Dashboard e-LOK")
    public void penggunaBeradaPadaHalamanDashboard() {endUser.beradaDiDashboardpage();}

    @When("Pengguna mengeklik textboxt Username")
    public void penggunaMengeklikBoxUsername() {
        endUser.mengeklikBoxUsername();
    }

    @When("Pengguna mengetik usernamenya '$username'")
    public void penggunaMengetikUsername(String username) {endUser.mengetikUsername(username);}

    @When("Pengguna mengeklik textboxt Password")
    public void penggunaMengeklikBoxPassword() {endUser.mengeklikBoxPassword();}

    @When("Pengguna mengetik passwordnya '$password'")
    public void penggunaMengetikPassword(String password) {endUser.mengetikPassword(password);}

    @When("Pengguna mengeklik tombol login")
    public void penggunaMengeklikLogin(){endUser.mengeklikLogin();}

    @Then("Pengguna akan melihat Nama User yaitu '$nama'")
    public void akanMelihatNamaPengguna(String nama) {endUser.akanLihatNamaPengguna(nama);}

////////////////////////////////////////////////////////////////////////

    @When("Pengguna mengeklik textboxt Search Courses")
    public void penggunaKlikBoxSearch(){endUser.mengeklikBoxSearch();}

    @When("Pengguna mengetik '$Big Data Komputasional'")
    public void penggunaKetikBigData(String keyword) {endUser.mengetikKeywordCourse(keyword);}

    @When("Pengguna mengeklik tombol cari")
    public void penggunaKlikCari(){endUser.mengeklikCariCourse();}

    @Then("Pengguna akan melihat Nama Matakuliah Big Data Komputasional")
    public void penggunaMelihatNamaMatakuliahBigData(){endUser.menemukanBigData();}


///////////////////////////////////////////////////////////////////////////

    @When("Pengguna mengeklik judul Big Data Komputasional")
    public void penggunaMengeklikBigData(){endUser.mengeklikTulisanBigData();}

    @When("pengguna klik enroll me")
    public void penggunaMengeklikEnroll(){endUser.mengeklikEnroll();}

    @Then("Terdapat menu unenroll")
    public void penggunaMelihatTombolEnroll(){endUser.akanLihatTulisanUnenroll();}


/////////////////////////////////////////////////////////////////////////

    @When("Pengguna mengeklik nama")
    public void penggunaKlikNama(){endUser.mengeklikNama();}

    @When("Pengguna mengeklik Logout")
    public void penggunaKlikLogout(){endUser.mengeklikLogout();}

    @Then("Pengguna akan melihat Tulisan")
    public void penggunaLihatTulisanDiHomepage(){endUser.akanLihatTulisan();}


/////////////////////////////////////////////////////////////////////////

    @When("Pengguna mengeklik tombol profil")
    public void penggunaKlikProfil(){endUser.mengeklikTombolProfil();}

    @Then("Pengguna akan melihat profil akunnya")
    public void penggunaAkanMelihatProfilnya() {endUser.akanLihatProfilnya();}


    @When("Pengguna mengeklik tombol grade")
    public void penggunaMengeklikTombolGrade() {endUser.mengeklikGrade();}

    @Then("Pengguna akan melihat nilai-nilai nya")
    public void penggunaAkanMelihatGrade() {endUser.akanLihatGrade();}

/////////////////////////////////////////////////////////////////////////

    @When("Pengguna mengeklik tombol messages")
    public void penggunaMengeklikTombolMessages() {endUser.mengeklikMessages();}

    @Then("Pengguna akan melihat messages-nya")
    public void penggunaAkanMelihatMessagesnya() {endUser.akanLihatMessages();}

/////////////////////////////////////////////////////////////////////////

    @When("Pengguna mengeklik tombol Matakuliah")
    public void penggunaMengeklikTombolMatakuliah() {endUser.mengeklikMatakuliah();}

    @Then("Pengguna akan melihat semua matakuliah yang tersedia")
    public void penggunaAkanMelihatSemuaMatakuliah() {endUser.akanLihatSemuaMatakuliah();}

//////////////////////////REGISTER USER//////////////////////////////////

    @When("Pengguna mengeklik tombol register")
    public void penggunaMengeklikTombolRegister(){}

    @When("Pengguna mengklik textbox Username")
    public void penggunaMengklikTextboxUsername(){}

    @When("Pengguna memasukkan username 'aa'")
    public void penggunaMemasukkanUsername(String registerusername){}

    @When("Pengguna mengklik textbox Password")
    public void penggunaMengklikTextboxPassword

    @When("Pengguna memasukkan password '$password'")
    public void penggunaMemasukkanPassword(String registerpassword){}

    @When("Pengguna mengeklik textbox Email")
    public void penggunaMengeklikTextboxEmail(){}

    @When("Pengguna memasukkan Email '$email'")
    public void penggunaMemasukkanEmail(String email){}

    @When("Pengguna mengeklik textbox Email (again)")
    public void penggunaMengeklikTextboxEmailAgain(){}

    @When("Pengguna memasukkan Email (again) '$emailagain'")
    public void penggunaMemasukkanTextboxEmailAgain(String emailagain){}

    @When("Pengguna mengeklik textbox First name")
    public void penggunaMengeklikTextboxFirstName(){}

    @When("Pengguna memasukkan First name 'Tes tes'")
    public void

    @When("Pengguna mengeklik textbox Surname")
    public void

    @When("Pengguna memasukkan Surname 'Tes'")
    public void

    @When("Pengguna mengeklik textbox City")
    public void

    @When("Pengguna memasukkan City 'Yogya'")
    public void

    @When("Pengguna mengeklik textbox Country")
    public void

    @When("Pengguna mengeklik Negara Indonesia")
    public void

    !--When Pengguna mengeklik tombol Create

    @Then("Pengguna akan melihat konfirmasi")
    public void


//    @AfterScenario
//    public void afterScenario() {
//        driver.quit();
//    }
}
