package CompoudId;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Accounts implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	CompoundKey compoundKey;
	private int accountBalance;

	public CompoundKey getCompoundKey() {
		return compoundKey;
	}

	public void setCompoundKey(CompoundKey compoundKey) {
		this.compoundKey = compoundKey;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

}
