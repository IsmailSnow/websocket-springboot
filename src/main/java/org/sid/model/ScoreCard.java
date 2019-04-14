package org.sid.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ScoreCard {
	
	private String totalRuns;
	private String totalOvers;
	private String battingTeamName;
	private String bowlingTeamName;

}
