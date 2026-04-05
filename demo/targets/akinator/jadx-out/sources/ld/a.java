package ld;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: ld.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0743a {
        public abstract a build();

        public abstract AbstractC0743a setApplicationBuild(String str);

        public abstract AbstractC0743a setCountry(String str);

        public abstract AbstractC0743a setDevice(String str);

        public abstract AbstractC0743a setFingerprint(String str);

        public abstract AbstractC0743a setHardware(String str);

        public abstract AbstractC0743a setLocale(String str);

        public abstract AbstractC0743a setManufacturer(String str);

        public abstract AbstractC0743a setMccMnc(String str);

        public abstract AbstractC0743a setModel(String str);

        public abstract AbstractC0743a setOsBuild(String str);

        public abstract AbstractC0743a setProduct(String str);

        public abstract AbstractC0743a setSdkVersion(Integer num);
    }

    public static AbstractC0743a builder() {
        return new m();
    }

    public abstract String getApplicationBuild();

    public abstract String getCountry();

    public abstract String getDevice();

    public abstract String getFingerprint();

    public abstract String getHardware();

    public abstract String getLocale();

    public abstract String getManufacturer();

    public abstract String getMccMnc();

    public abstract String getModel();

    public abstract String getOsBuild();

    public abstract String getProduct();

    public abstract Integer getSdkVersion();
}
