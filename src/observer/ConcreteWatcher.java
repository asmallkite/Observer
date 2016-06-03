package observer;

/**
 * Created by 李争 on 2016/6/3 0003.
 *
 */
public class ConcreteWatcher implements Watcher {
    @Override
    public void update(String str) {
        System.out.println("ConcreteWatcher.update"+str);
    }
}
