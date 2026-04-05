package d1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface i extends e {
    @Override // d1.e
    /* bridge */ /* synthetic */ default i find(Object obj) {
        return super.find(obj);
    }

    @Override // d1.e
    /* synthetic */ Iterable getCompositionGroups();

    Iterable<Object> getData();

    default int getGroupSize() {
        return 0;
    }

    default Object getIdentity() {
        return null;
    }

    Object getKey();

    Object getNode();

    default int getSlotsSize() {
        return 0;
    }

    String getSourceInfo();

    @Override // d1.e
    /* synthetic */ boolean isEmpty();
}
