package c0;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Iterator;
import java.util.List;
import p0.o4;
import p0.o5;
import p0.v5;
import p0.z4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f11696a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11697b;

    /* renamed from: c, reason: collision with root package name */
    public final p0.j2 f11698c;

    /* renamed from: d, reason: collision with root package name */
    public final p0.j2 f11699d;

    /* renamed from: e, reason: collision with root package name */
    public final p0.j2 f11700e;

    /* renamed from: f, reason: collision with root package name */
    public final p0.j2 f11701f;

    /* renamed from: g, reason: collision with root package name */
    public final p0.j2 f11702g;

    /* renamed from: h, reason: collision with root package name */
    public final SnapshotStateList f11703h;

    /* renamed from: i, reason: collision with root package name */
    public final SnapshotStateList f11704i;

    /* renamed from: j, reason: collision with root package name */
    public final p0.j2 f11705j;

    /* renamed from: k, reason: collision with root package name */
    public long f11706k;

    /* renamed from: l, reason: collision with root package name */
    public final v5 f11707l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public final n2 f11708a;

        /* renamed from: b, reason: collision with root package name */
        public final String f11709b;

        /* renamed from: c, reason: collision with root package name */
        public C0018a f11710c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ z1 f11711d;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: c0.z1$a$a, reason: collision with other inner class name */
        public final class C0018a implements v5 {

            /* renamed from: b, reason: collision with root package name */
            public final c f11712b;

            /* renamed from: c, reason: collision with root package name */
            public kv.l f11713c;

            /* renamed from: e, reason: collision with root package name */
            public kv.l f11714e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ a f11715f;

            public C0018a(a aVar, c0.z1.c animation, kv.l transitionSpec, kv.l targetValueByState) {
                kotlin.jvm.internal.e0.checkNotNullParameter(animation, "animation");
                kotlin.jvm.internal.e0.checkNotNullParameter(transitionSpec, "transitionSpec");
                kotlin.jvm.internal.e0.checkNotNullParameter(targetValueByState, "targetValueByState");
                this.f11715f = aVar;
                this.f11712b = animation;
                this.f11713c = transitionSpec;
                this.f11714e = targetValueByState;
            }

            public final c0.z1.c getAnimation() {
                return this.f11712b;
            }

            public final kv.l getTargetValueByState() {
                return this.f11714e;
            }

            public final kv.l getTransitionSpec() {
                return this.f11713c;
            }

            @Override // p0.v5
            public Object getValue() {
                updateAnimationStates(this.f11715f.f11711d.getSegment());
                return this.f11712b.getValue();
            }

            public final void setTargetValueByState(kv.l lVar) {
                kotlin.jvm.internal.e0.checkNotNullParameter(lVar, "<set-?>");
                this.f11714e = lVar;
            }

            public final void setTransitionSpec(kv.l lVar) {
                kotlin.jvm.internal.e0.checkNotNullParameter(lVar, "<set-?>");
                this.f11713c = lVar;
            }

            public final void updateAnimationStates(a2 segment) {
                kotlin.jvm.internal.e0.checkNotNullParameter(segment, "segment");
                Object objInvoke = this.f11714e.invoke(segment.getTargetState());
                boolean zIsSeeking = this.f11715f.f11711d.isSeeking();
                c cVar = this.f11712b;
                if (zIsSeeking) {
                    cVar.updateInitialAndTargetValue$animation_core_release(this.f11714e.invoke(segment.getInitialState()), objInvoke, (j0) this.f11713c.invoke(segment));
                } else {
                    cVar.updateTargetValue$animation_core_release(objInvoke, (j0) this.f11713c.invoke(segment));
                }
            }
        }

        public a(z1 z1Var, n2 typeConverter, String label) {
            kotlin.jvm.internal.e0.checkNotNullParameter(typeConverter, "typeConverter");
            kotlin.jvm.internal.e0.checkNotNullParameter(label, "label");
            this.f11711d = z1Var;
            this.f11708a = typeConverter;
            this.f11709b = label;
        }

        public final v5 animate(kv.l transitionSpec, kv.l targetValueByState) {
            kotlin.jvm.internal.e0.checkNotNullParameter(transitionSpec, "transitionSpec");
            kotlin.jvm.internal.e0.checkNotNullParameter(targetValueByState, "targetValueByState");
            C0018a c0018a = this.f11710c;
            z1 z1Var = this.f11711d;
            if (c0018a == null) {
                z1 z1Var2 = this.f11711d;
                c0018a = new C0018a(this, new c(z1Var2, targetValueByState.invoke(z1Var2.getCurrentState()), q.createZeroVectorFrom(this.f11708a, targetValueByState.invoke(z1Var.getCurrentState())), this.f11708a, this.f11709b), transitionSpec, targetValueByState);
                this.f11710c = c0018a;
                z1Var.addAnimation$animation_core_release(c0018a.getAnimation());
            }
            c0018a.setTargetValueByState(targetValueByState);
            c0018a.setTransitionSpec(transitionSpec);
            c0018a.updateAnimationStates(z1Var.getSegment());
            return c0018a;
        }

        public final c0.z1.a.a getData$animation_core_release() {
            return this.f11710c;
        }

        public final String getLabel() {
            return this.f11709b;
        }

        public final n2 getTypeConverter() {
            return this.f11708a;
        }

        public final void setData$animation_core_release(c0.z1.a.a aVar) {
            this.f11710c = aVar;
        }

        public final void setupSeeking$animation_core_release() {
            C0018a c0018a = this.f11710c;
            if (c0018a != null) {
                c animation = c0018a.getAnimation();
                kv.l targetValueByState = c0018a.getTargetValueByState();
                z1 z1Var = this.f11711d;
                animation.updateInitialAndTargetValue$animation_core_release(targetValueByState.invoke(z1Var.getSegment().getInitialState()), c0018a.getTargetValueByState().invoke(z1Var.getSegment().getTargetState()), (j0) c0018a.getTransitionSpec().invoke(z1Var.getSegment()));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements a2 {

        /* renamed from: a, reason: collision with root package name */
        public final Object f11716a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f11717b;

        public b(Object obj, Object obj2) {
            this.f11716a = obj;
            this.f11717b = obj2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a2)) {
                return false;
            }
            a2 a2Var = (a2) obj;
            return kotlin.jvm.internal.e0.areEqual(getInitialState(), a2Var.getInitialState()) && kotlin.jvm.internal.e0.areEqual(getTargetState(), a2Var.getTargetState());
        }

        @Override // c0.a2
        public Object getInitialState() {
            return this.f11716a;
        }

        @Override // c0.a2
        public Object getTargetState() {
            return this.f11717b;
        }

        public int hashCode() {
            Object initialState = getInitialState();
            int iHashCode = (initialState != null ? initialState.hashCode() : 0) * 31;
            Object targetState = getTargetState();
            return iHashCode + (targetState != null ? targetState.hashCode() : 0);
        }

        @Override // c0.a2
        public /* bridge */ /* synthetic */ boolean isTransitioningTo(Object obj, Object obj2) {
            return super.isTransitioningTo(obj, obj2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class c implements v5 {

        /* renamed from: b, reason: collision with root package name */
        public final n2 f11718b;

        /* renamed from: c, reason: collision with root package name */
        public final String f11719c;

        /* renamed from: e, reason: collision with root package name */
        public final p0.j2 f11720e;

        /* renamed from: f, reason: collision with root package name */
        public final p0.j2 f11721f;

        /* renamed from: g, reason: collision with root package name */
        public final p0.j2 f11722g;

        /* renamed from: h, reason: collision with root package name */
        public final p0.j2 f11723h;

        /* renamed from: i, reason: collision with root package name */
        public final p0.j2 f11724i;

        /* renamed from: j, reason: collision with root package name */
        public final p0.j2 f11725j;

        /* renamed from: k, reason: collision with root package name */
        public final p0.j2 f11726k;

        /* renamed from: l, reason: collision with root package name */
        public v f11727l;

        /* renamed from: m, reason: collision with root package name */
        public final i1 f11728m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ z1 f11729n;

        public c(z1 z1Var, Object obj, v initialVelocityVector, n2 typeConverter, String label) {
            Object objInvoke;
            kotlin.jvm.internal.e0.checkNotNullParameter(initialVelocityVector, "initialVelocityVector");
            kotlin.jvm.internal.e0.checkNotNullParameter(typeConverter, "typeConverter");
            kotlin.jvm.internal.e0.checkNotNullParameter(label, "label");
            this.f11729n = z1Var;
            this.f11718b = typeConverter;
            this.f11719c = label;
            p0.j2 j2VarMutableStateOf$default = o5.mutableStateOf$default(obj, null, 2, null);
            this.f11720e = j2VarMutableStateOf$default;
            this.f11721f = o5.mutableStateOf$default(o.spring$default(0.0f, 0.0f, null, 7, null), null, 2, null);
            this.f11722g = o5.mutableStateOf$default(new y1(getAnimationSpec(), typeConverter, obj, j2VarMutableStateOf$default.getValue(), initialVelocityVector), null, 2, null);
            this.f11723h = o5.mutableStateOf$default(Boolean.TRUE, null, 2, null);
            this.f11724i = o5.mutableStateOf$default(0L, null, 2, null);
            this.f11725j = o5.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            this.f11726k = o5.mutableStateOf$default(obj, null, 2, null);
            this.f11727l = initialVelocityVector;
            Float f10 = y3.getVisibilityThresholdMap().get(typeConverter);
            if (f10 != null) {
                float fFloatValue = f10.floatValue();
                v vVar = (v) typeConverter.getConvertToVector().invoke(obj);
                int size$animation_core_release = vVar.getSize$animation_core_release();
                for (int i10 = 0; i10 < size$animation_core_release; i10++) {
                    vVar.set$animation_core_release(i10, fFloatValue);
                }
                objInvoke = this.f11718b.getConvertFromVector().invoke(vVar);
            } else {
                objInvoke = null;
            }
            this.f11728m = o.spring$default(0.0f, 0.0f, objInvoke, 3, null);
        }

        public static void a(c cVar, Object obj, boolean z10, int i10) {
            if ((i10 & 1) != 0) {
                obj = cVar.getValue();
            }
            Object obj2 = obj;
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            j0 animationSpec = (!z10 || (cVar.getAnimationSpec() instanceof i1)) ? cVar.getAnimationSpec() : cVar.f11728m;
            cVar.f11722g.setValue(new y1(animationSpec, cVar.f11718b, obj2, cVar.f11720e.getValue(), cVar.f11727l));
            z1.access$onChildAnimationUpdated(cVar.f11729n);
        }

        public final y1 getAnimation() {
            return (y1) this.f11722g.getValue();
        }

        public final j0 getAnimationSpec() {
            return (j0) this.f11721f.getValue();
        }

        public final long getDurationNanos$animation_core_release() {
            return getAnimation().getDurationNanos();
        }

        public final String getLabel() {
            return this.f11719c;
        }

        public final n2 getTypeConverter() {
            return this.f11718b;
        }

        @Override // p0.v5
        public Object getValue() {
            return this.f11726k.getValue();
        }

        public final boolean isFinished$animation_core_release() {
            return ((Boolean) this.f11723h.getValue()).booleanValue();
        }

        public final void onPlayTimeChanged$animation_core_release(long j10, float f10) {
            p0.j2 j2Var = this.f11724i;
            long durationNanos = f10 == 0.0f ? getAnimation().getDurationNanos() : (long) ((j10 - ((Number) j2Var.getValue()).longValue()) / f10);
            setValue$animation_core_release(getAnimation().getValueFromNanos(durationNanos));
            this.f11727l = getAnimation().getVelocityVectorFromNanos(durationNanos);
            if (getAnimation().isFinishedFromNanos(durationNanos)) {
                setFinished$animation_core_release(true);
                j2Var.setValue(0L);
            }
        }

        public final void resetAnimation$animation_core_release() {
            this.f11725j.setValue(Boolean.TRUE);
        }

        public final void seekTo$animation_core_release(long j10) {
            setValue$animation_core_release(getAnimation().getValueFromNanos(j10));
            this.f11727l = getAnimation().getVelocityVectorFromNanos(j10);
        }

        public final void setFinished$animation_core_release(boolean z10) {
            this.f11723h.setValue(Boolean.valueOf(z10));
        }

        public void setValue$animation_core_release(Object obj) {
            this.f11726k.setValue(obj);
        }

        public final void updateInitialAndTargetValue$animation_core_release(Object obj, Object obj2, j0 animationSpec) {
            kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
            this.f11720e.setValue(obj2);
            this.f11721f.setValue(animationSpec);
            if (kotlin.jvm.internal.e0.areEqual(getAnimation().getInitialValue(), obj) && kotlin.jvm.internal.e0.areEqual(getAnimation().getTargetValue(), obj2)) {
                return;
            }
            a(this, obj, false, 2);
        }

        public final void updateTargetValue$animation_core_release(Object obj, j0 animationSpec) {
            kotlin.jvm.internal.e0.checkNotNullParameter(animationSpec, "animationSpec");
            p0.j2 j2Var = this.f11720e;
            boolean zAreEqual = kotlin.jvm.internal.e0.areEqual(j2Var.getValue(), obj);
            p0.j2 j2Var2 = this.f11725j;
            if (!zAreEqual || ((Boolean) j2Var2.getValue()).booleanValue()) {
                j2Var.setValue(obj);
                this.f11721f.setValue(animationSpec);
                a(this, null, !isFinished$animation_core_release(), 1);
                setFinished$animation_core_release(false);
                this.f11724i.setValue(Long.valueOf(this.f11729n.getPlayTimeNanos()));
                j2Var2.setValue(Boolean.FALSE);
            }
        }
    }

    public z1(t0 transitionState, String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(transitionState, "transitionState");
        this.f11696a = transitionState;
        this.f11697b = str;
        this.f11698c = o5.mutableStateOf$default(getCurrentState(), null, 2, null);
        this.f11699d = o5.mutableStateOf$default(new b(getCurrentState(), getCurrentState()), null, 2, null);
        this.f11700e = o5.mutableStateOf$default(0L, null, 2, null);
        this.f11701f = o5.mutableStateOf$default(Long.MIN_VALUE, null, 2, null);
        this.f11702g = o5.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        this.f11703h = z4.mutableStateListOf();
        this.f11704i = z4.mutableStateListOf();
        this.f11705j = o5.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.f11707l = z4.derivedStateOf(new e2(this));
    }

    public static final void access$onChildAnimationUpdated(z1 z1Var) {
        z1Var.setUpdateChildrenNeeded$animation_core_release(true);
        if (z1Var.isSeeking()) {
            long jMax = 0;
            for (c cVar : z1Var.f11703h) {
                jMax = Math.max(jMax, cVar.getDurationNanos$animation_core_release());
                cVar.seekTo$animation_core_release(z1Var.f11706k);
            }
            z1Var.setUpdateChildrenNeeded$animation_core_release(false);
        }
    }

    public final boolean addAnimation$animation_core_release(c0.z1.c animation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animation, "animation");
        return this.f11703h.add(animation);
    }

    public final boolean addTransition$animation_core_release(z1 transition) {
        kotlin.jvm.internal.e0.checkNotNullParameter(transition, "transition");
        return this.f11704i.add(transition);
    }

    public final void animateTo$animation_core_release(Object obj, p0.w wVar, int i10) {
        int i11;
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(-1493585151);
        if ((i10 & 14) == 0) {
            i11 = (wVarStartRestartGroup.changed(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= wVarStartRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else if (!isSeeking()) {
            updateTarget$animation_core_release(obj, wVarStartRestartGroup, i11 & 126);
            if (!kotlin.jvm.internal.e0.areEqual(obj, getCurrentState()) || isRunning() || getUpdateChildrenNeeded$animation_core_release()) {
                int i12 = (i11 >> 3) & 14;
                wVarStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged = wVarStartRestartGroup.changed(this);
                Object objRememberedValue = wVarStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
                    objRememberedValue = new c2(this, null);
                    wVarStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                wVarStartRestartGroup.endReplaceableGroup();
                p0.k1.LaunchedEffect(this, (kv.p) objRememberedValue, wVarStartRestartGroup, i12);
            }
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new d2(this, obj, i10));
    }

    public final List<c0.z1.c> getAnimations() {
        return this.f11703h;
    }

    public final Object getCurrentState() {
        return this.f11696a.getCurrentState();
    }

    public final String getLabel() {
        return this.f11697b;
    }

    public final long getLastSeekedTimeNanos$animation_core_release() {
        return this.f11706k;
    }

    public final long getPlayTimeNanos() {
        return ((Number) this.f11700e.getValue()).longValue();
    }

    public final a2 getSegment() {
        return (a2) this.f11699d.getValue();
    }

    public final Object getTargetState() {
        return this.f11698c.getValue();
    }

    public final long getTotalDurationNanos() {
        return ((Number) this.f11707l.getValue()).longValue();
    }

    public final List<z1> getTransitions() {
        return this.f11704i;
    }

    public final boolean getUpdateChildrenNeeded$animation_core_release() {
        return ((Boolean) this.f11702g.getValue()).booleanValue();
    }

    public final boolean isRunning() {
        return ((Number) this.f11701f.getValue()).longValue() != Long.MIN_VALUE;
    }

    public final boolean isSeeking() {
        return ((Boolean) this.f11705j.getValue()).booleanValue();
    }

    public final void onFrame$animation_core_release(long j10, float f10) {
        p0.j2 j2Var = this.f11701f;
        if (((Number) j2Var.getValue()).longValue() == Long.MIN_VALUE) {
            onTransitionStart$animation_core_release(j10);
        }
        setUpdateChildrenNeeded$animation_core_release(false);
        setPlayTimeNanos(j10 - ((Number) j2Var.getValue()).longValue());
        boolean z10 = true;
        for (c cVar : this.f11703h) {
            if (!cVar.isFinished$animation_core_release()) {
                cVar.onPlayTimeChanged$animation_core_release(getPlayTimeNanos(), f10);
            }
            if (!cVar.isFinished$animation_core_release()) {
                z10 = false;
            }
        }
        for (z1 z1Var : this.f11704i) {
            if (!kotlin.jvm.internal.e0.areEqual(z1Var.getTargetState(), z1Var.getCurrentState())) {
                z1Var.onFrame$animation_core_release(getPlayTimeNanos(), f10);
            }
            if (!kotlin.jvm.internal.e0.areEqual(z1Var.getTargetState(), z1Var.getCurrentState())) {
                z10 = false;
            }
        }
        if (z10) {
            onTransitionEnd$animation_core_release();
        }
    }

    public final void onTransitionEnd$animation_core_release() {
        this.f11701f.setValue(Long.MIN_VALUE);
        setCurrentState$animation_core_release(getTargetState());
        setPlayTimeNanos(0L);
        this.f11696a.setRunning$animation_core_release(false);
    }

    public final void onTransitionStart$animation_core_release(long j10) {
        this.f11701f.setValue(Long.valueOf(j10));
        this.f11696a.setRunning$animation_core_release(true);
    }

    public final void removeAnimation$animation_core_release(c0.z1.c animation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(animation, "animation");
        this.f11703h.remove(animation);
    }

    public final boolean removeTransition$animation_core_release(z1 transition) {
        kotlin.jvm.internal.e0.checkNotNullParameter(transition, "transition");
        return this.f11704i.remove(transition);
    }

    public final void seek(Object obj, Object obj2, long j10) {
        this.f11701f.setValue(Long.MIN_VALUE);
        this.f11696a.setRunning$animation_core_release(false);
        if (!isSeeking() || !kotlin.jvm.internal.e0.areEqual(getCurrentState(), obj) || !kotlin.jvm.internal.e0.areEqual(getTargetState(), obj2)) {
            setCurrentState$animation_core_release(obj);
            setTargetState$animation_core_release(obj2);
            setSeeking$animation_core_release(true);
            this.f11699d.setValue(new b(obj, obj2));
        }
        for (z1 z1Var : this.f11704i) {
            if (z1Var.isSeeking()) {
                z1Var.seek(z1Var.getCurrentState(), z1Var.getTargetState(), j10);
            }
        }
        Iterator<T> it = this.f11703h.iterator();
        while (it.hasNext()) {
            ((c) it.next()).seekTo$animation_core_release(j10);
        }
        this.f11706k = j10;
    }

    public final void setCurrentState$animation_core_release(Object obj) {
        this.f11696a.setCurrentState$animation_core_release(obj);
    }

    public final void setLastSeekedTimeNanos$animation_core_release(long j10) {
        this.f11706k = j10;
    }

    public final void setPlayTimeNanos(long j10) {
        this.f11700e.setValue(Long.valueOf(j10));
    }

    public final void setSeeking$animation_core_release(boolean z10) {
        this.f11705j.setValue(Boolean.valueOf(z10));
    }

    public final void setTargetState$animation_core_release(Object obj) {
        this.f11698c.setValue(obj);
    }

    public final void setUpdateChildrenNeeded$animation_core_release(boolean z10) {
        this.f11702g.setValue(Boolean.valueOf(z10));
    }

    public final void updateTarget$animation_core_release(Object obj, p0.w wVar, int i10) {
        int i11;
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(-583974681);
        if ((i10 & 14) == 0) {
            i11 = (wVarStartRestartGroup.changed(obj) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= wVarStartRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else if (!isSeeking() && !kotlin.jvm.internal.e0.areEqual(getTargetState(), obj)) {
            this.f11699d.setValue(new b(getTargetState(), obj));
            setCurrentState$animation_core_release(getTargetState());
            setTargetState$animation_core_release(obj);
            if (!isRunning()) {
                setUpdateChildrenNeeded$animation_core_release(true);
            }
            Iterator<T> it = this.f11703h.iterator();
            while (it.hasNext()) {
                ((c) it.next()).resetAnimation$animation_core_release();
            }
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup == null) {
            return;
        }
        o4VarEndRestartGroup.updateScope(new f2(this, obj, i10));
    }

    public final void removeAnimation$animation_core_release(c0.z1.a deferredAnimation) {
        c animation;
        kotlin.jvm.internal.e0.checkNotNullParameter(deferredAnimation, "deferredAnimation");
        a.C0018a data$animation_core_release = deferredAnimation.getData$animation_core_release();
        if (data$animation_core_release == null || (animation = data$animation_core_release.getAnimation()) == null) {
            return;
        }
        removeAnimation$animation_core_release((c0.z1.c) animation);
    }

    public /* synthetic */ z1(t0 t0Var, String str, int i10, kotlin.jvm.internal.u uVar) {
        this(t0Var, (i10 & 2) != 0 ? null : str);
    }

    public z1(Object obj, String str) {
        this(new t0(obj), str);
    }

    public static /* synthetic */ void getPlayTimeNanos$annotations() {
    }

    public static /* synthetic */ void isSeeking$annotations() {
    }
}
