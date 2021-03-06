package net.blerf.ftl.model;

import java.util.List;
import java.util.ListIterator;

import net.blerf.ftl.model.Score.Difficulty;


public class AchievementRecord {

	private String achievementId;
	private Difficulty difficulty;

	public AchievementRecord( String achievementId, Difficulty difficulty ) {
		this.achievementId = achievementId;
		this.difficulty = difficulty;
	}

	public void setDifficulty( Difficulty d ) { difficulty = d; }
	public void setAchievementId( String s ) { achievementId = s; }

	public Difficulty getDifficulty() { return difficulty; }
	public String getAchievementId() { return achievementId; }


	public static AchievementRecord getFromListById( List<AchievementRecord> achList, String achievementId ) {
		for ( AchievementRecord rec : achList ) {
			if ( rec.getAchievementId().equals(achievementId) ) {
				return rec;
			}
		}
		return null;
	}

	public static void removeFromListById( List<AchievementRecord> achList, String achievementId ) {
		for ( ListIterator<AchievementRecord> it = achList.listIterator(); it.hasNext(); ) {
			AchievementRecord rec = it.next();
			if ( rec.getAchievementId().equals(achievementId) ) {
				it.remove();
			}
		}
	}
}
