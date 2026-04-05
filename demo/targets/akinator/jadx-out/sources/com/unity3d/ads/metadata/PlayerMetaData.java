package com.unity3d.ads.metadata;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class PlayerMetaData extends MetaData {
    public static final String KEY_SERVER_ID = "server_id";

    public PlayerMetaData(Context context) {
        super(context);
        setCategory("player");
    }

    public void setServerId(String str) {
        set(KEY_SERVER_ID, str);
    }
}
