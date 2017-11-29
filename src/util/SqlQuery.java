package util;

public class SqlQuery {
	public static final String SELECT = "select *from dbo.Candidate";
	public static final String FIRST_COLUMN = "FirstName";
	public static final String SECOND_COLUMN = "LastName";
	public static final String THIRD_COLUMN = "BirthDate";
	public static final String FORTH_COLUMN = "Address";
	public static final String FIVE_COLUMN = "Phone";
	public static final String SIX_COLUMN = "Email";

	public static final String SEVEN_COLUMN = "ExpInYear";
	public static final String EIGHT_COLUMN = "ProSkill";

	public static final String NIGHT_COLUMN = "Graduation_date";
	public static final String TEN_COLUMN = "Graduation_rank";
	public static final String ELEVEN_COLUMN = "Education";

	public static final String TWELVE_COLUMN = "Major";
	public static final String THIRDTEEN_COLUMN = "Semeter";
	public static final String FORTEEN_COLUMN = "University";
	public static final String FITHTEEN_COLUMN = "CandidateType";
	

	public static final String INSERT_EC = "insert into dbo.Candidate("
			+ FIRST_COLUMN + "," + SECOND_COLUMN + "," + THIRD_COLUMN + ","
			+ FORTH_COLUMN + "," + FIVE_COLUMN + "," + SIX_COLUMN + ","
			+ SEVEN_COLUMN + "," + EIGHT_COLUMN + ","+FITHTEEN_COLUMN+") values " + "(?,?,?,?,?,?,?,?,?) ";
	public static final String INSERT_FC = "insert into dbo.Candidate("
			+ FIRST_COLUMN + "," + SECOND_COLUMN + "," + THIRD_COLUMN + ","
			+ FORTH_COLUMN + "," + FIVE_COLUMN + "," + SIX_COLUMN + ","
			+ NIGHT_COLUMN + "," + TEN_COLUMN + "," + ELEVEN_COLUMN + ","+FITHTEEN_COLUMN+") values"
			+ "(?,?,?,?,?,?,?,?,?,?)";
	public static final String INSERT_IC = "insert into dbo.Candidate("
			+ FIRST_COLUMN + "," + SECOND_COLUMN + "," + THIRD_COLUMN + ","
			+ FORTH_COLUMN + "," + FIVE_COLUMN + "," + SIX_COLUMN + ","
			+ TWELVE_COLUMN + "," + THIRDTEEN_COLUMN + "," + FORTEEN_COLUMN
			+ ","+FITHTEEN_COLUMN+") values" + "(?,?,?,?,?,?,?,?,?,?)";
	public static final String SELECT_TYPE="select CandidateType from dbo.Candidate where id=? ";
	
	public static final String SELECT_RECU="select * from dbo.Recruitment_package ";
	public static final String UPDATE_CADIDATE_RECU="update dbo.Recruitment_package set NumberCandicate=NumberCandicate+1 where Recrument_package=?";
	
}
