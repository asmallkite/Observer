package observer;

/**
 * Created by 李争 on 2016/6/3 0003.
 *
 */
public class Test {
    public static void main(String[] args) {
        Watched girl = new ConcreteWatched();
        Watcher boy1 = new ConcreteWatcher();
        Watcher boy2 = new ConcreteWatcher();
        Watcher boy3 = new ConcreteWatcher();

        girl.addWatcher(boy1);
        girl.addWatcher(boy2);
        girl.addWatcher(boy3);

        girl.notifyWatchers("开心···");
        girl.removeWatcher(boy1);
        girl.notifyWatchers("少一个");

    }
}
