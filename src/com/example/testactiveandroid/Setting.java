package com.example.testactiveandroid;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

@Table(name = "Settings")
public class Setting extends Model {

    @Column(name = "MediaDownloaded")
    public int mediaDownloaded;

    public static Setting getSetting() {

        Setting setting = new Select().from(Setting.class).executeSingle();

        if (setting == null) {
            setting = new Setting();
            setting.mediaDownloaded = 0;
            setting.save();
        }

        return setting;
    }

    public static Setting getAll() {
        return new Select().from(Setting.class).executeSingle();
    }
}
