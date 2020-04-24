package tskinder.odkop.dao;

import tskinder.odkop.model.Vote;

public interface VoteDAO extends GenericDAO<Vote, Long> {

	public Vote getVoteByUserIdDiscoveryId(long userId, long discoveryId);
}
