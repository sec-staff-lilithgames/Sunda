package com.mbridge.msdk.out;

import android.content.Context;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class MBCommonHandler {
    protected Context context;
    protected Map<String, Object> properties;

    public MBCommonHandler() {
    }

    public abstract boolean load();

    public abstract void release();

    public MBCommonHandler(Map<String, Object> map, Context context) {
        this.properties = map;
        this.context = context;
    }
}
