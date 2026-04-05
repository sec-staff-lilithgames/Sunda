package p0;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface w {
    <V, T> void apply(V v10, kv.p pVar);

    f0 buildContext();

    boolean changed(Object obj);

    default boolean changed(boolean z10) {
        return changed(z10);
    }

    default boolean changedInstance(Object obj) {
        return changed(obj);
    }

    void collectParameterInformation();

    <T> T consume(l0 l0Var);

    <T> void createNode(kv.a aVar);

    void deactivateToEndGroup(boolean z10);

    void disableReusing();

    void disableSourceInformation();

    void enableReusing();

    void endDefaults();

    void endMovableGroup();

    void endNode();

    void endProvider();

    void endProviders();

    void endReplaceGroup();

    void endReplaceableGroup();

    o4 endRestartGroup();

    void endReusableGroup();

    void endToMarker(int i10);

    d getApplier();

    zu.m getApplyCoroutineContext();

    long getCompositeKeyHashCode();

    y0 getComposition();

    d1.e getCompositionData();

    default int getCompoundKeyHash() {
        return Long.hashCode(getCompositeKeyHashCode());
    }

    p0 getCurrentCompositionLocalMap();

    int getCurrentMarker();

    boolean getDefaultsInvalid();

    boolean getInserting();

    i3 getRecomposeScope();

    Object getRecomposeScopeIdentity();

    boolean getSkipping();

    void insertMovableContent(f2 f2Var, Object obj);

    void insertMovableContentReferences(List<tu.v> list);

    Object joinKey(Object obj, Object obj2);

    void recordSideEffect(kv.a aVar);

    void recordUsed(i3 i3Var);

    Object rememberedValue();

    boolean shouldExecute(boolean z10, int i10);

    void skipCurrentGroup();

    void skipToGroupEnd();

    void sourceInformation(String str);

    void sourceInformationMarkerEnd();

    void sourceInformationMarkerStart(int i10, String str);

    void startDefaults();

    void startMovableGroup(int i10, Object obj);

    void startNode();

    void startProvider(h3 h3Var);

    void startProviders(h3[] h3VarArr);

    void startReplaceGroup(int i10);

    void startReplaceableGroup(int i10);

    w startRestartGroup(int i10);

    void startReusableGroup(int i10, Object obj);

    void startReusableNode();

    void updateRememberedValue(Object obj);

    void useNode();

    default boolean changed(char c10) {
        return changed(c10);
    }

    default boolean changed(byte b10) {
        return changed(b10);
    }

    default boolean changed(short s10) {
        return changed(s10);
    }

    default boolean changed(int i10) {
        return changed(i10);
    }

    default boolean changed(float f10) {
        return changed(f10);
    }

    default boolean changed(long j10) {
        return changed(j10);
    }

    default boolean changed(double d10) {
        return changed(d10);
    }

    static /* synthetic */ void getApplier$annotations() {
    }

    static /* synthetic */ void getApplyCoroutineContext$annotations() {
    }

    static /* synthetic */ void getCompositeKeyHashCode$annotations() {
    }

    @tu.f
    static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    static /* synthetic */ void getCurrentMarker$annotations() {
    }

    static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    static /* synthetic */ void getInserting$annotations() {
    }

    static /* synthetic */ void getRecomposeScope$annotations() {
    }

    static /* synthetic */ void getRecomposeScopeIdentity$annotations() {
    }

    static /* synthetic */ void getSkipping$annotations() {
    }
}
