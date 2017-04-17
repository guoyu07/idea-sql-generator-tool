package org.yseasony.sqlgenerator;

import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.components.PersistentStateComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Created by yseasony on 17/3/14.
 */
public class SqlGeneratorApplicationComponent implements ApplicationComponent, PersistentStateComponent<PluginState> {
    @Override
    public void initComponent() {

    }

    @Override
    public void disposeComponent() {

    }

    @NotNull
    @Override
    public String getComponentName() {
        return null;
    }

    @Nullable
    @Override
    public PluginState getState() {
        return null;
    }

    @Override
    public void loadState(PluginState pluginState) {

    }
}
