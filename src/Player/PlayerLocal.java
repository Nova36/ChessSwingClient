package Player;

import edu.neumont.chessModel.Board.Player;
import edu.neumont.chessModel.Board.Team;
import edu.neumont.chessModel.Movement.Move;

public class PlayerLocal extends Player {

	public PlayerLocal(Team team) {
		super(team);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Move getMove() {
		team.gawaitingMove = true;
		try {
			wait();
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		Move tempMove = awaitedMove;
		awaitedMove = null;
		awaitingMove = false;
		return tempMove;
	}

	@Override
	public boolean handleMove(Move arg0) {
		// TODO Auto-generated method stub
		return false;
	}

}
