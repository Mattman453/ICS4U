/* Author: Matt Cruickshank
Class: ICS4U

Project: Bank Machine, Trust Account
Input: Name of the owner of the regular account, current balance and name of the trustee
Processing: None at this time
Output: None at this time
*/

package ics;

public class TrustAccount extends BankAccount {
    private String trusteeName;

    public String getTrusteeName() {
        return trusteeName;
    }

    public void setTrusteeName(String trusteeName) {
        this.trusteeName = trusteeName;
    }

    public TrustAccount(String ownersName, double balance, String trusteeName) {
        super(ownersName, balance);
        this.trusteeName = trusteeName;
    }
}
