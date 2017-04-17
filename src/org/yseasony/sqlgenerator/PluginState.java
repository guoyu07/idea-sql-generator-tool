package org.yseasony.sqlgenerator;


import java.util.Map;

/**
 * @Author bruce.ge
 * @Date 2017/2/20
 * @Description
 */
public class PluginState {
    private Map<String, Object> profile;

    public Map<String, Object> getProfile() {
        return profile;
    }

    public void setProfile(Map<String, Object> profile) {
        this.profile = profile;
    }

    public Map<String, Object> getDefaultProfile() {
        if (profile != null) {
            return profile;
        } else {

            return profile;
        }
    }
}
