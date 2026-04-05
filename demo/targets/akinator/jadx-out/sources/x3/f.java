package x3;

import android.content.ClipData;
import android.util.Pair;
import android.view.ContentInfo;
import java.util.Objects;
import java.util.function.Predicate;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f {
    public static Pair<ContentInfo, ContentInfo> partition(ContentInfo contentInfo, Predicate<ClipData.Item> predicate) {
        ClipData clip = contentInfo.getClip();
        if (clip.getItemCount() != 1) {
            Objects.requireNonNull(predicate);
            Pair pairB = n.b(clip, new o9.b3(predicate, 23));
            return pairB.first == null ? Pair.create(null, contentInfo) : pairB.second == null ? Pair.create(contentInfo, null) : Pair.create(new ContentInfo.Builder(contentInfo).setClip((ClipData) pairB.first).build(), new ContentInfo.Builder(contentInfo).setClip((ClipData) pairB.second).build());
        }
        boolean zTest = predicate.test(clip.getItemAt(0));
        ContentInfo contentInfo2 = zTest ? contentInfo : null;
        if (zTest) {
            contentInfo = null;
        }
        return Pair.create(contentInfo2, contentInfo);
    }
}
