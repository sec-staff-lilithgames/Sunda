package com.sfbx.appconsentv3.ui.model;

import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class NoticeViewState {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class GeolocationNotice extends NoticeViewState {
        public static final GeolocationNotice INSTANCE = new GeolocationNotice();

        private GeolocationNotice() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class None extends NoticeViewState {
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Notice extends NoticeViewState {
        public static final Notice INSTANCE = new Notice();

        private Notice() {
            super(null);
        }
    }

    public /* synthetic */ NoticeViewState(u uVar) {
        this();
    }

    private NoticeViewState() {
    }
}
