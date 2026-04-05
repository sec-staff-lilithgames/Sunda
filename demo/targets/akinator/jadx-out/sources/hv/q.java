package hv;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class q {
    public static final boolean access$createsCycle(l lVar) {
        for (l parent = lVar.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getKey() == null || lVar.getKey() == null) {
                try {
                    if (Files.isSameFile(parent.getPath(), lVar.getPath())) {
                        return true;
                    }
                } catch (IOException | SecurityException unused) {
                    continue;
                }
            } else if (e0.areEqual(parent.getKey(), lVar.getKey())) {
                return true;
            }
        }
        return false;
    }

    public static final Object access$keyOf(Path path, LinkOption[] linkOptionArr) {
        try {
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length);
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) cf.a.b(), (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
            e0.checkNotNullExpressionValue(attributes, "readAttributes(...)");
            return attributes.fileKey();
        } catch (Throwable unused) {
            return null;
        }
    }
}
