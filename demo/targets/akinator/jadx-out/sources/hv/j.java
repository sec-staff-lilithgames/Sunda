package hv;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;
import uu.b2;
import uu.c2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f59208a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static final LinkOption[] f59209b = {LinkOption.NOFOLLOW_LINKS};

    /* renamed from: c, reason: collision with root package name */
    public static final LinkOption[] f59210c = new LinkOption[0];

    /* renamed from: d, reason: collision with root package name */
    public static final Set f59211d = c2.emptySet();

    /* renamed from: e, reason: collision with root package name */
    public static final Set f59212e = b2.setOf(FileVisitOption.FOLLOW_LINKS);

    public final LinkOption[] toLinkOptions(boolean z10) {
        return z10 ? f59210c : f59209b;
    }

    public final Set<FileVisitOption> toVisitOptions(boolean z10) {
        return z10 ? f59212e : f59211d;
    }
}
