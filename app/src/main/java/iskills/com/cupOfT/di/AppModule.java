package iskills.com.cupOfT.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import iskills.com.cupOfT.MainActivity;

/** lennyhicks 5/8/18 */
// TODO Step ?? Build app Module
@Module
public abstract class AppModule {
  @ContributesAndroidInjector
  abstract MainActivity mainActivity();
}
