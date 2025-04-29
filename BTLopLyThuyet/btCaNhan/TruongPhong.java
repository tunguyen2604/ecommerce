public class TruongPhong extends NhanVien{
    private double phuCap;
    private int soNamDuongChuc;

    public TruongPhong(String tenNhanVien, double heSoLuong, double phuCap, int soNamDuongChuc) {
        super(tenNhanVien, heSoLuong);
        this.phuCap=phuCap;
        this.soNamDuongChuc=soNamDuongChuc;
    }

    public TruongPhong() {
        super();
        this.phuCap=0;
        this.soNamDuongChuc=0;
    }

    
}
