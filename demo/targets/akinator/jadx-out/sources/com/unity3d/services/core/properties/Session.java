package com.unity3d.services.core.properties;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface Session {
    public static final Default Default = Default.$$INSTANCE;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Default implements Session {
        static final /* synthetic */ Default $$INSTANCE = new Default();

        /* renamed from: id, reason: collision with root package name */
        private static final String f50749id = SessionIdReader.INSTANCE.getSessionId();

        private Default() {
        }

        @Override // com.unity3d.services.core.properties.Session
        public String getId() {
            return f50749id;
        }
    }

    String getId();
}
