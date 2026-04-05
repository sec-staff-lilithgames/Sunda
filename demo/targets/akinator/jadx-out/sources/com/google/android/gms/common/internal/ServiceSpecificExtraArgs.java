package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class ServiceSpecificExtraArgs {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface CastExtraArgs {
        public static final String LISTENER = "listener";
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface GamesExtraArgs {
        public static final String DESIRED_LOCALE = "com.google.android.gms.games.key.desiredLocale";
        public static final String GAME_PACKAGE_NAME = "com.google.android.gms.games.key.gamePackageName";
        public static final String SIGNIN_OPTIONS = "com.google.android.gms.games.key.signInOptions";
        public static final String WINDOW_TOKEN = "com.google.android.gms.games.key.popupWindowToken";
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface PlusExtraArgs {
        public static final String PLUS_AUTH_PACKAGE = "auth_package";
    }

    private ServiceSpecificExtraArgs() {
    }
}
