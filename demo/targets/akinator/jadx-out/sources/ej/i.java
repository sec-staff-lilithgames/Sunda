package ej;

import com.google.firebase.inappmessaging.model.MessageType;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f54423a;

    static {
        int[] iArr = new int[MessageType.values().length];
        f54423a = iArr;
        try {
            iArr[MessageType.BANNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f54423a[MessageType.MODAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f54423a[MessageType.IMAGE_ONLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f54423a[MessageType.CARD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
