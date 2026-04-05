package mc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class s {
    public abstract jc.q createArrayDeserializer(jc.k kVar, cd.a aVar, jc.d dVar) throws jc.r;

    public abstract jc.q createBeanDeserializer(jc.k kVar, jc.o oVar, jc.d dVar) throws jc.r;

    public abstract jc.q createBuilderBasedDeserializer(jc.k kVar, jc.o oVar, jc.d dVar, Class<?> cls) throws jc.r;

    public abstract jc.q createCollectionDeserializer(jc.k kVar, cd.e eVar, jc.d dVar) throws jc.r;

    public abstract jc.q createCollectionLikeDeserializer(jc.k kVar, cd.d dVar, jc.d dVar2) throws jc.r;

    public abstract jc.q createEnumDeserializer(jc.k kVar, jc.o oVar, jc.d dVar) throws jc.r;

    public abstract jc.x createKeyDeserializer(jc.k kVar, jc.o oVar) throws jc.r;

    public abstract jc.q createMapDeserializer(jc.k kVar, cd.j jVar, jc.d dVar) throws jc.r;

    public abstract jc.q createMapLikeDeserializer(jc.k kVar, cd.i iVar, jc.d dVar) throws jc.r;

    public abstract jc.q createReferenceDeserializer(jc.k kVar, cd.l lVar, jc.d dVar) throws jc.r;

    public abstract jc.q createTreeDeserializer(jc.j jVar, jc.o oVar, jc.d dVar) throws jc.r;

    public abstract wc.g findTypeDeserializer(jc.j jVar, jc.o oVar) throws jc.r;

    public abstract c0 findValueInstantiator(jc.k kVar, jc.d dVar) throws jc.r;

    public abstract boolean hasExplicitDeserializerFor(jc.j jVar, Class<?> cls);

    public abstract jc.o mapAbstractType(jc.j jVar, jc.o oVar) throws jc.r;

    public abstract s withAbstractTypeResolver(jc.a aVar);

    public abstract s withAdditionalDeserializers(t tVar);

    public abstract s withAdditionalKeyDeserializers(u uVar);

    public abstract s withDeserializerModifier(i iVar);

    public abstract s withValueInstantiators(e0 e0Var);
}
