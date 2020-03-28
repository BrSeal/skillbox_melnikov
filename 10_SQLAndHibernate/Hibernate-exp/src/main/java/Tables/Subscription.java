package Tables;

import Tables.PrimaryKeys.SubscriptionPK;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table (name = "subscriptions")
@IdClass (SubscriptionPK.class)
@Data
public class Subscription
{
	@Id
	private Integer student_id;
	@Id
	private Integer course_id;
	private Date subscription_date;
	
	
}
