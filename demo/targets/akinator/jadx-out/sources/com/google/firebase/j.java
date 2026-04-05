package com.google.firebase;

import android.content.Context;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class j {
    public static final g app(c cVar, String name) {
        e0.checkNotNullParameter(cVar, "<this>");
        e0.checkNotNullParameter(name, "name");
        g gVar = g.getInstance(name);
        e0.checkNotNullExpressionValue(gVar, "getInstance(...)");
        return gVar;
    }

    public static final g getApp(c cVar) {
        e0.checkNotNullParameter(cVar, "<this>");
        g gVar = g.getInstance();
        e0.checkNotNullExpressionValue(gVar, "getInstance(...)");
        return gVar;
    }

    public static final k getOptions(c cVar) {
        e0.checkNotNullParameter(cVar, "<this>");
        k options = getApp(c.f29664a).getOptions();
        e0.checkNotNullExpressionValue(options, "getOptions(...)");
        return options;
    }

    public static final g initialize(c cVar, Context context) {
        e0.checkNotNullParameter(cVar, "<this>");
        e0.checkNotNullParameter(context, "context");
        return g.initializeApp(context);
    }

    public static final g initialize(c cVar, Context context, k options) {
        e0.checkNotNullParameter(cVar, "<this>");
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(options, "options");
        g gVarInitializeApp = g.initializeApp(context, options);
        e0.checkNotNullExpressionValue(gVarInitializeApp, "initializeApp(...)");
        return gVarInitializeApp;
    }

    public static final g initialize(c cVar, Context context, k options, String name) {
        e0.checkNotNullParameter(cVar, "<this>");
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(options, "options");
        e0.checkNotNullParameter(name, "name");
        g gVarInitializeApp = g.initializeApp(context, options, name);
        e0.checkNotNullExpressionValue(gVarInitializeApp, "initializeApp(...)");
        return gVarInitializeApp;
    }
}
