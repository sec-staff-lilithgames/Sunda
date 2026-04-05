package ei;

import java.util.ArrayList;
import java.util.Set;
import ji.r;
import ji.u;
import kotlin.jvm.internal.e0;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d implements dk.h {

    /* renamed from: a, reason: collision with root package name */
    public final u f54400a;

    public d(u userMetadata) {
        e0.checkNotNullParameter(userMetadata, "userMetadata");
        this.f54400a = userMetadata;
    }

    @Override // dk.h
    public void onRolloutsStateChanged(dk.g rolloutsState) {
        e0.checkNotNullParameter(rolloutsState, "rolloutsState");
        Set<dk.f> rolloutAssignments = rolloutsState.getRolloutAssignments();
        e0.checkNotNullExpressionValue(rolloutAssignments, "getRolloutAssignments(...)");
        Set<dk.f> set = rolloutAssignments;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(set, 10));
        for (dk.f fVar : set) {
            arrayList.add(r.create(fVar.getRolloutId(), fVar.getParameterKey(), fVar.getParameterValue(), fVar.getVariantId(), fVar.getTemplateVersion()));
        }
        this.f54400a.updateRolloutsState(arrayList);
        f.getLogger().d("Updated Crashlytics Rollout State");
    }
}
