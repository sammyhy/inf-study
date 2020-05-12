package kr.co.infStudy.model;

import java.sql.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class QnaReplyVO {
	private int qr_no;
	private int q_no;
	private int u_no;
	private Date reg_dt;
	private String content;


}
