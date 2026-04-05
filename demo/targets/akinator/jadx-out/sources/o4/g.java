package o4;

import gv.s;
import java.io.File;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.a f77481e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(kv.a aVar) {
        super(0);
        this.f77481e = aVar;
    }

    @Override // kv.a
    public final File invoke() {
        File file = (File) this.f77481e.invoke();
        if (e0.areEqual(s.getExtension(file), "preferences_pb")) {
            File absoluteFile = file.getAbsoluteFile();
            e0.checkNotNullExpressionValue(absoluteFile, "file.absoluteFile");
            return absoluteFile;
        }
        throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
    }
}
