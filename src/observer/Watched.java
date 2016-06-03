package observer;

/**
 * Created by 李争 on 2016/6/3 0003.
 *
 */
public interface Watched {
    public void addWatcher(Watcher watcher);
    public void removeWatcher(Watcher watcher);
    public void notifyWatchers(String str);
}
