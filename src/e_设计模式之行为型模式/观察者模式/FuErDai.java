package e_设计模式之行为型模式.观察者模式;

public class FuErDai extends AbstractFuErDai {
	public FuErDai (String name) {
		super(name);
	}

	@Override
	public void attachGrilFriend (GrilFriend grilFriend) {
		this.observers.add( grilFriend );
	}

	@Override
	public void detachGrilFriend (GrilFriend grilFriend) {
		this.observers.remove( grilFriend );
	}

	@Override
	public void notifyAllGrilFriend (String message) {
		for ( GrilFriend gf: observers ) {
			gf.getMessage( message, name );
		}
	}
}
