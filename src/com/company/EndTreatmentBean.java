package com.company;


public class EndTreatmentBean {


    // 脱硫设备
private Integer count;
    // 脱硫工艺
    private String sulfurMethod;
    // 投运时间(年/月)
    private String sulfurDate;
    // 脱硫岛效率(％)
    private Double sulfurEfficient;
    // 投运率(％)
    private double sulfurMoveEfficient;
    // 脱硫剂名称
    private String sulfurName;
    // 脱硫剂使用量(吨)
    private double sulfurUsCount;
    // 脱硫烟气旁路
    private String sulfurOutMethod;

    // 脱硝设备
    // 脱硝工艺
    private String nitreMethod;
    // 投运时间(年/月)
    private String nitreDate;
    // 脱硝效率(％)
    private double nitreEfficient;
    // 投运率(％)
    private double nitreMoveEfficient;
    // 脱硫剂名称
    private String nitreName;
    // 脱硝剂使用量(吨)
    private double nitreUsCount;

    // 低氮燃烧
    // 是否采用低氮燃烧技术
    private boolean nitrogenLow;
    // 投运时间(年/月)
    private String nitrogenDate;
    // 燃烧器出口浓度（mg/m3）
    private double nitrogenOutEfficient;
    // 投运率(％)
    private double nitrogenMoveEfficient;

    // 除尘设备
    // 除尘工艺
    private String dustExtractionMethod;
    // 投运时间(年/月)
    private String dustExtractionDate;
    // 除尘风机总风量(立方米/小时)
    private double dustExtractionWindCount;
    // 废气收集率(％)
    private double dustExtractionGasEfficient;
    // 除尘效率(％)
    private double dustExtractionEfficient;
    // 投运率(％)
    private double dustExtractionMoveEfficient;
    // voc回收技术
    private String dustExtractionVocRecycleTech;
    // 备注:其他回收技术
    private String dustExtractionOtherRecycleTech;
    // voc销毁技术
    private String dustExtractionVocDestroyTech;
    // 备注:其他回收技术
    private String dustExtractionOtherDestroyTech;
    // 处理效率(％)
    private double dustExtractionDealEfficient;
    // 设备风量(立方米/小时)
    private boolean dustExtractionDeviceWind;
    // 年运行时间(小时)
    private double dustExtractionYearHours;
    // 有机废气排放浓度(毫克/立方米)
    private double dustExtractionFlueGas;

    public String getSulfurMethod() {
        return sulfurMethod;
    }


    public String getSulfurDate() {
        return sulfurDate;
    }

    public void setSulfurDate(String sulfurDate) {
        this.sulfurDate = sulfurDate;
    }

    public double getSulfurEfficient() {
        return sulfurEfficient;
    }

    public void setSulfurEfficient(double sulfurEfficient) {
        this.sulfurEfficient = sulfurEfficient;
    }

    public double getSulfurMoveEfficient() {
        return sulfurMoveEfficient;
    }

    public void setSulfurMoveEfficient(double sulfurMoveEfficient) {
        this.sulfurMoveEfficient = sulfurMoveEfficient;
    }

    public String getSulfurName() {
        return sulfurName;
    }

    public void setSulfurName(String sulfurName) {
        this.sulfurName = sulfurName;
    }

    public double getSulfurUsCount() {
        return sulfurUsCount;
    }

    public void setSulfurUsCount(double sulfurUsCount) {
        this.sulfurUsCount = sulfurUsCount;
    }

    public String getSulfurOutMethod() {
        return sulfurOutMethod;
    }

    public void setSulfurOutMethod(String sulfurOutMethod) {
        this.sulfurOutMethod = sulfurOutMethod;
    }

    public String getNitreMethod() {
        return nitreMethod;
    }

    public void setNitreMethod(String nitreMethod) {
        this.nitreMethod = nitreMethod;
    }

    public String getNitreDate() {
        return nitreDate;
    }

    public void setNitreDate(String nitreDate) {
        this.nitreDate = nitreDate;
    }

    public double getNitreEfficient() {
        return nitreEfficient;
    }

    public void setNitreEfficient(double nitreEfficient) {
        this.nitreEfficient = nitreEfficient;
    }

    public double getNitreMoveEfficient() {
        return nitreMoveEfficient;
    }

    public void setNitreMoveEfficient(double nitreMoveEfficient) {
        this.nitreMoveEfficient = nitreMoveEfficient;
    }

    public String getNitreName() {
        return nitreName;
    }

    public void setNitreName(String nitreName) {
        this.nitreName = nitreName;
    }

    public double getNitreUsCount() {
        return nitreUsCount;
    }

    public void setNitreUsCount(double nitreUsCount) {
        this.nitreUsCount = nitreUsCount;
    }

    public boolean isNitrogenLow() {
        return nitrogenLow;
    }

    public void setNitrogenLow(boolean nitrogenLow) {
        this.nitrogenLow = nitrogenLow;
    }

    public String getNitrogenDate() {
        return nitrogenDate;
    }

    public void setNitrogenDate(String nitrogenDate) {
        this.nitrogenDate = nitrogenDate;
    }

    public double getNitrogenOutEfficient() {
        return nitrogenOutEfficient;
    }

    public void setNitrogenOutEfficient(double nitrogenOutEfficient) {
        this.nitrogenOutEfficient = nitrogenOutEfficient;
    }

    public double getNitrogenMoveEfficient() {
        return nitrogenMoveEfficient;
    }

    public void setNitrogenMoveEfficient(double nitrogenMoveEfficient) {
        this.nitrogenMoveEfficient = nitrogenMoveEfficient;
    }

    public String getDustExtractionMethod() {
        return dustExtractionMethod;
    }

    public void setDustExtractionMethod(String dustExtractionMethod) {
        this.dustExtractionMethod = dustExtractionMethod;
    }

    public String getDustExtractionDate() {
        return dustExtractionDate;
    }

    public void setDustExtractionDate(String dustExtractionDate) {
        this.dustExtractionDate = dustExtractionDate;
    }

    public double getDustExtractionWindCount() {
        return dustExtractionWindCount;
    }

    public void setDustExtractionWindCount(double dustExtractionWindCount) {
        this.dustExtractionWindCount = dustExtractionWindCount;
    }

    public double getDustExtractionGasEfficient() {
        return dustExtractionGasEfficient;
    }

    public void setDustExtractionGasEfficient(double dustExtractionGasEfficient) {
        this.dustExtractionGasEfficient = dustExtractionGasEfficient;
    }

    public double getDustExtractionEfficient() {
        return dustExtractionEfficient;
    }

    public void setDustExtractionEfficient(double dustExtractionEfficient) {
        this.dustExtractionEfficient = dustExtractionEfficient;
    }

    public double getDustExtractionMoveEfficient() {
        return dustExtractionMoveEfficient;
    }

    public void setDustExtractionMoveEfficient(double dustExtractionMoveEfficient) {
        this.dustExtractionMoveEfficient = dustExtractionMoveEfficient;
    }

    public String getDustExtractionVocRecycleTech() {
        return dustExtractionVocRecycleTech;
    }

    public void setDustExtractionVocRecycleTech(String dustExtractionVocRecycleTech) {
        this.dustExtractionVocRecycleTech = dustExtractionVocRecycleTech;
    }

    public String getDustExtractionOtherRecycleTech() {
        return dustExtractionOtherRecycleTech;
    }

    public void setDustExtractionOtherRecycleTech(String dustExtractionOtherRecycleTech) {
        this.dustExtractionOtherRecycleTech = dustExtractionOtherRecycleTech;
    }

    public String getDustExtractionVocDestroyTech() {
        return dustExtractionVocDestroyTech;
    }

    public void setDustExtractionVocDestroyTech(String dustExtractionVocDestroyTech) {
        this.dustExtractionVocDestroyTech = dustExtractionVocDestroyTech;
    }

    public String getDustExtractionOtherDestroyTech() {
        return dustExtractionOtherDestroyTech;
    }

    public void setDustExtractionOtherDestroyTech(String dustExtractionOtherDestroyTech) {
        this.dustExtractionOtherDestroyTech = dustExtractionOtherDestroyTech;
    }

    public double getDustExtractionDealEfficient() {
        return dustExtractionDealEfficient;
    }

    public void setDustExtractionDealEfficient(double dustExtractionDealEfficient) {
        this.dustExtractionDealEfficient = dustExtractionDealEfficient;
    }

    public boolean isDustExtractionDeviceWind() {
        return dustExtractionDeviceWind;
    }

    public void setDustExtractionDeviceWind(boolean dustExtractionDeviceWind) {
        this.dustExtractionDeviceWind = dustExtractionDeviceWind;
    }

    public double getDustExtractionYearHours() {
        return dustExtractionYearHours;
    }

    public void setDustExtractionYearHours(double dustExtractionYearHours) {
        this.dustExtractionYearHours = dustExtractionYearHours;
    }

    public double getDustExtractionFlueGas() {
        return dustExtractionFlueGas;
    }

    public void setDustExtractionFlueGas(double dustExtractionFlueGas) {
        this.dustExtractionFlueGas = dustExtractionFlueGas;
    }
}
