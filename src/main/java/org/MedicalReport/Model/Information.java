package org.MedicalReport.Model;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

public class Information {
    private int patientNumber;
    private String admissionDate;
    private String name;
    private String patientName;
    private String yearsAge;
    private String monthsAge;
    private String dob;
    private String gender;
    private String dateOfInterview;
    private String caseClassification;
    private String currentStatusOfCase;
    private String fathersName;
    private String houseNo;
    private String setting;

    public void setPatientNumber(int patientNumber) {
        this.patientNumber = patientNumber;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setYearsAge(String yearsAge) {
        this.yearsAge = yearsAge;
    }

    public void setMonthsAge(String monthsAge) {
        this.monthsAge = monthsAge;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDateOfInterview(String dateOfInterview) {
        this.dateOfInterview = dateOfInterview;
    }

    public void setCaseClassification(String caseClassification) {
        this.caseClassification = caseClassification;
    }

    public void setCurrentStatusOfCase(String currentStatusOfCase) {
        this.currentStatusOfCase = currentStatusOfCase;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void setDateOfOnsetOfSymptoms(String dateOfOnsetOfSymptoms) {
        this.dateOfOnsetOfSymptoms = dateOfOnsetOfSymptoms;
    }

    public void setInitialSymptoms(String initialSymptoms) {
        this.initialSymptoms = initialSymptoms;
    }

    public void setReferredNameOfFacility(String referredNameOfFacility) {
        this.referredNameOfFacility = referredNameOfFacility;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    public void setDateOfAdmissionInIsolationFacility(String dateOfAdmissionInIsolationFacility) {
        this.dateOfAdmissionInIsolationFacility = dateOfAdmissionInIsolationFacility;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public void setCauseOfDeath(String causeOfDeath) {
        this.causeOfDeath = causeOfDeath;
    }

    public void setFeverChills(String feverChills) {
        this.feverChills = feverChills;
    }

    public void setSoreThroat(String soreThroat) {
        this.soreThroat = soreThroat;
    }

    public void setNauseaVomiting(String nauseaVomiting) {
        this.nauseaVomiting = nauseaVomiting;
    }

    public void setGeneralWeakness(String generalWeakness) {
        this.generalWeakness = generalWeakness;
    }

    public void setBreathlessness(String breathlessness) {
        this.breathlessness = breathlessness;
    }

    public void setHeadache(String headache) {
        this.headache = headache;
    }

    public void setCough(String cough) {
        this.cough = cough;
    }

    public void setDiarrhea(String diarrhea) {
        this.diarrhea = diarrhea;
    }

    public void setIrritabilityConfusion(String irritabilityConfusion) {
        this.irritabilityConfusion = irritabilityConfusion;
    }

    public void setRunnyNose(String runnyNose) {
        this.runnyNose = runnyNose;
    }

    public void setPainMSAJ(String painMSAJ) {
        this.painMSAJ = painMSAJ;
    }

    public void setPainOther(String painOther) {
        this.painOther = painOther;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setAbnormalLungXRayOrCTScanFindings(String abnormalLungXRayOrCTScanFindings) {
        this.abnormalLungXRayOrCTScanFindings = abnormalLungXRayOrCTScanFindings;
    }

    public void setComa(String coma) {
        this.coma = coma;
    }

    public void setCtridor(String ctridor) {
        this.ctridor = ctridor;
    }

    public void setTachypnoea(String tachypnoea) {
        this.tachypnoea = tachypnoea;
    }

    public void setSeizure(String seizure) {
        this.seizure = seizure;
    }

    public void setRednessOfEyes(String rednessOfEyes) {
        this.rednessOfEyes = rednessOfEyes;
    }

    public void setAbnormalLungAuscultation(String abnormalLungAuscultation) {
        this.abnormalLungAuscultation = abnormalLungAuscultation;
    }

    public void setOtherSymptom(String otherSymptom) {
        this.otherSymptom = otherSymptom;
    }

    public void setCopd(String copd) {
        this.copd = copd;
    }

    public void setHypertension(String hypertension) {
        this.hypertension = hypertension;
    }

    public void setChronicNeurologicalOrNeuromuscularDisease(String chronicNeurologicalOrNeuromuscularDisease) {
        this.chronicNeurologicalOrNeuromuscularDisease = chronicNeurologicalOrNeuromuscularDisease;
    }

    public void setChronicRenalDisease(String chronicRenalDisease) {
        this.chronicRenalDisease = chronicRenalDisease;
    }

    public void setAsthma(String asthma) {
        this.asthma = asthma;
    }

    public void setHeartDisease(String heartDisease) {
        this.heartDisease = heartDisease;
    }

    public void setBronchitis(String bronchitis) {
        this.bronchitis = bronchitis;
    }

    public void setPregnancy(String pregnancy) {
        this.pregnancy = pregnancy;
    }

    public void setImmunocompromisedConditionHIVTB(String immunocompromisedConditionHIVTB) {
        this.immunocompromisedConditionHIVTB = immunocompromisedConditionHIVTB;
    }

    public void setMalignancy(String malignancy) {
        this.malignancy = malignancy;
    }

    public void setPostPartum(String postPartum) {
        this.postPartum = postPartum;
    }

    public void setOtherDisease(String otherDisease) {
        this.otherDisease = otherDisease;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes;
    }

    public void setLiverDisease(String liverDisease) {
        this.liverDisease = liverDisease;
    }

    public void setNone(String none) {
        this.none = none;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setOtherOccupation(String otherOccupation) {
        this.otherOccupation = otherOccupation;
    }

    public void setContactWithCOVIDCase(String contactWithCOVIDCase) {
        this.contactWithCOVIDCase = contactWithCOVIDCase;
    }

    public void setTypeOfSampleCollected(String typeOfSampleCollected) {
        this.typeOfSampleCollected = typeOfSampleCollected;
    }

    public void setNameOfSampleCollectionCenter(String nameOfSampleCollectionCenter) {
        this.nameOfSampleCollectionCenter = nameOfSampleCollectionCenter;
    }

    public void setDateOfSampleCollection(String dateOfSampleCollection) {
        this.dateOfSampleCollection = dateOfSampleCollection;
    }

    public void setSentToLab(String sentToLab) {
        this.sentToLab = sentToLab;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setDateOfLabResult(String dateOfLabResult) {
        this.dateOfLabResult = dateOfLabResult;
    }

    public void setHospitalization(String hospitalization) {
        this.hospitalization = hospitalization;
    }

    public void setDateOfHospitalization(String dateOfHospitalization) {
        this.dateOfHospitalization = dateOfHospitalization;
    }

    public void setiCUAdmission(String iCUAdmission) {
        this.iCUAdmission = iCUAdmission;
    }

    public void setDateOfICUAdmission(String dateOfICUAdmission) {
        this.dateOfICUAdmission = dateOfICUAdmission;
    }

    public void setAdmittedIn(String admittedIn) {
        this.admittedIn = admittedIn;
    }

    public void setTreatingPhysician(String treatingPhysician) {
        this.treatingPhysician = treatingPhysician;
    }

    public void setResults(String results) {
        this.results = results;
    }

    private String village;

    public int fetchPatientNumber() {
        return patientNumber;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public String getName() {
        return name;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getYearsAge() {
        return yearsAge;
    }

    public String getMonthsAge() {
        return monthsAge;
    }

    public String getDob() {
        return dob;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfInterview() {
        return dateOfInterview;
    }

    public String getCaseClassification() {
        return caseClassification;
    }

    public String getCurrentStatusOfCase() {
        return currentStatusOfCase;
    }

    public String getFathersName() {
        return fathersName;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public String getSetting() {
        return setting;
    }

    public String getVillage() {
        return village;
    }

    public String getBlock() {
        return block;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getDateOfOnsetOfSymptoms() {
        return dateOfOnsetOfSymptoms;
    }

    public String getInitialSymptoms() {
        return initialSymptoms;
    }

    public String getReferredNameOfFacility() {
        return referredNameOfFacility;
    }

    public String getAddress() {
        return address;
    }

    public String getPhNumber() {
        return phNumber;
    }

    public String getDateOfAdmissionInIsolationFacility() {
        return dateOfAdmissionInIsolationFacility;
    }

    public String getOutcome() {
        return outcome;
    }

    public String getCauseOfDeath() {
        return causeOfDeath;
    }

    public String getFeverChills() {
        return feverChills;
    }

    public String getSoreThroat() {
        return soreThroat;
    }

    public String getNauseaVomiting() {
        return nauseaVomiting;
    }

    public String getGeneralWeakness() {
        return generalWeakness;
    }

    public String getBreathlessness() {
        return breathlessness;
    }

    public String getHeadache() {
        return headache;
    }

    public String getCough() {
        return cough;
    }

    public String getDiarrhea() {
        return diarrhea;
    }

    public String getIrritabilityConfusion() {
        return irritabilityConfusion;
    }

    public String getRunnyNose() {
        return runnyNose;
    }

    public String getPainMSAJ() {
        return painMSAJ;
    }

    public String getPainOther() {
        return painOther;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getAbnormalLungXRayOrCTScanFindings() {
        return abnormalLungXRayOrCTScanFindings;
    }

    public String getComa() {
        return coma;
    }

    public String getCtridor() {
        return ctridor;
    }

    public String getTachypnoea() {
        return tachypnoea;
    }

    public String getSeizure() {
        return seizure;
    }

    public String getRednessOfEyes() {
        return rednessOfEyes;
    }

    public String getAbnormalLungAuscultation() {
        return abnormalLungAuscultation;
    }

    public String getOtherSymptom() {
        return otherSymptom;
    }

    public String getCopd() {
        return copd;
    }

    public String getHypertension() {
        return hypertension;
    }

    public String getChronicNeurologicalOrNeuromuscularDisease() {
        return chronicNeurologicalOrNeuromuscularDisease;
    }

    public String getChronicRenalDisease() {
        return chronicRenalDisease;
    }

    public String getAsthma() {
        return asthma;
    }

    public String getHeartDisease() {
        return heartDisease;
    }

    public String getBronchitis() {
        return bronchitis;
    }

    public String getPregnancy() {
        return pregnancy;
    }

    public String getImmunocompromisedConditionHIVTB() {
        return immunocompromisedConditionHIVTB;
    }

    public String getMalignancy() {
        return malignancy;
    }

    public String getPostPartum() {
        return postPartum;
    }

    public String getOtherDisease() {
        return otherDisease;
    }

    public String getDiabetes() {
        return diabetes;
    }

    public String getLiverDisease() {
        return liverDisease;
    }

    public String getNone() {
        return none;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getOtherOccupation() {
        return otherOccupation;
    }

    public String getContactWithCOVIDCase() {
        return contactWithCOVIDCase;
    }

    public String getTypeOfSampleCollected() {
        return typeOfSampleCollected;
    }

    public String getNameOfSampleCollectionCenter() {
        return nameOfSampleCollectionCenter;
    }

    public String getDateOfSampleCollection() {
        return dateOfSampleCollection;
    }

    public String getSentToLab() {
        return sentToLab;
    }

    public String getResult() {
        return result;
    }

    public String getDateOfLabResult() {
        return dateOfLabResult;
    }

    public String getHospitalization() {
        return hospitalization;
    }

    public String getDateOfHospitalization() {
        return dateOfHospitalization;
    }

    public String getiCUAdmission() {
        return iCUAdmission;
    }

    public String getDateOfICUAdmission() {
        return dateOfICUAdmission;
    }

    public String getAdmittedIn() {
        return admittedIn;
    }

    public String getTreatingPhysician() {
        return treatingPhysician;
    }

    public String getResults() {
        return results;
    }

    private String block;
    private String phoneNumber;
    private String emailId;
    private String dateOfOnsetOfSymptoms;
    private String initialSymptoms;
    private String referredNameOfFacility;
    private String address;
    private String phNumber;
    private String dateOfAdmissionInIsolationFacility;
    private String outcome;
    private String causeOfDeath;
    private String feverChills;
    private String soreThroat;
    private String nauseaVomiting;
    private String generalWeakness;
    private String breathlessness;
    private String headache;
    private String cough;
    private String diarrhea;
    private String irritabilityConfusion;
    private String runnyNose;
    private String painMSAJ;
    private String painOther;
    private String temperature;
    private String abnormalLungXRayOrCTScanFindings;
    private String coma;
    private String ctridor;
    private String tachypnoea;
    private String seizure;
    private String rednessOfEyes;
    private String abnormalLungAuscultation;
    private String otherSymptom;
    private String copd;
    private String hypertension;
    private String chronicNeurologicalOrNeuromuscularDisease;
    private String chronicRenalDisease;
    private String asthma;
    private String heartDisease;
    private String bronchitis;
    private String pregnancy;
    private String immunocompromisedConditionHIVTB;
    private String malignancy;
    private String postPartum;
    private String otherDisease;
    private String diabetes;
    private String liverDisease;
    private String none;
    private String occupation;
    private String otherOccupation;
    private String contactWithCOVIDCase;
    private String typeOfSampleCollected;
    private String nameOfSampleCollectionCenter;
    private String dateOfSampleCollection;
    private String sentToLab;
    private String result;
    private String dateOfLabResult;
    private String hospitalization;
    private String dateOfHospitalization;
    private String iCUAdmission;
    private String dateOfICUAdmission;
    private String admittedIn;
    private String treatingPhysician;
    private String results;

    public Information(){}

    public Information(int patientNumber, String admissionDate, String name, String patientName, String yearsAge, String monthsAge, String dob, String gender, String dateOfInterview,
                       String caseClassification, String currentStatusOfCase, String fathersName, String houseNo, String setting, String village, String block, String phoneNumber,
                       String emailId, String dateOfOnsetOfSymptoms, String initialSymptoms, String referredNameOfFacility, String address, String phNumber,
                       String dateOfAdmissionInIsolationFacility, String outcome, String causeOfDeath, String feverChills, String soreThroat, String nauseaVomiting,
                       String generalWeakness, String breathlessness, String headache, String cough, String diarrhea, String irritabilityConfusion, String runnyNose,
                       String painMSAJ, String painOther, String temperature, String abnormalLungXRayOrCTScanFindings, String coma, String ctridor, String tachypnoea,
                       String seizure, String rednessOfEyes, String abnormalLungAuscultation, String otherSymptom, String copd, String hypertension,
                       String chronicNeurologicalOrNeuromuscularDisease, String chronicRenalDisease, String asthma, String heartDisease, String bronchitis,
                       String pregnancy, String immunocompromisedConditionHIVTB, String malignancy, String postPartum, String otherDisease, String diabetes,
                       String liverDisease, String none, String occupation, String otherOccupation, String contactWithCOVIDCase, String typeOfSampleCollected,
                       String nameOfSampleCollectionCenter, String dateOfSampleCollection, String sentToLab, String result,
                       String dateOfLabResult, String hospitalization, String dateOfHospitalization, String iCUAdmission, String dateOfICUAdmission,
                       String admittedIn, String treatingPhysician, String results) {
        this.patientNumber = patientNumber;
        this.admissionDate = admissionDate;
        this.name = name;
        this.patientName = patientName;
        this.yearsAge = yearsAge;
        this.monthsAge = monthsAge;
        this.dob = dob;
        this.gender = gender;
        this.dateOfInterview = dateOfInterview;
        this.caseClassification = caseClassification;
        this.currentStatusOfCase = currentStatusOfCase;
        this.fathersName = fathersName;
        this.houseNo = houseNo;
        this.setting = setting;
        this.village = village;
        this.block = block;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.dateOfOnsetOfSymptoms = dateOfOnsetOfSymptoms;
        this.initialSymptoms = initialSymptoms;
        this.referredNameOfFacility = referredNameOfFacility;
        this.address = address;
        this.phNumber = phNumber;
        this.dateOfAdmissionInIsolationFacility = dateOfAdmissionInIsolationFacility;
        this.outcome = outcome;
        this.causeOfDeath = causeOfDeath;
        this.feverChills = feverChills;
        this.soreThroat = soreThroat;
        this.nauseaVomiting = nauseaVomiting;
        this.generalWeakness = generalWeakness;
        this.breathlessness = breathlessness;
        this.headache = headache;
        this.cough = cough;
        this.diarrhea = diarrhea;
        this.irritabilityConfusion = irritabilityConfusion;
        this.runnyNose = runnyNose;
        this.painMSAJ = painMSAJ;
        this.painOther = painOther;
        this.temperature = temperature;
        this.abnormalLungXRayOrCTScanFindings = abnormalLungXRayOrCTScanFindings;
        this.coma = coma;
        this.ctridor = ctridor;
        this.tachypnoea = tachypnoea;
        this.seizure = seizure;
        this.rednessOfEyes = rednessOfEyes;
        this.abnormalLungAuscultation = abnormalLungAuscultation;
        this.otherSymptom = otherSymptom;
        this.copd = copd;
        this.hypertension = hypertension;
        this.chronicNeurologicalOrNeuromuscularDisease = chronicNeurologicalOrNeuromuscularDisease;
        this.chronicRenalDisease = chronicRenalDisease;
        this.asthma = asthma;
        this.heartDisease = heartDisease;
        this.bronchitis = bronchitis;
        this.pregnancy = pregnancy;
        this.immunocompromisedConditionHIVTB = immunocompromisedConditionHIVTB;
        this.malignancy = malignancy;
        this.postPartum = postPartum;
        this.otherDisease = otherDisease;
        this.diabetes = diabetes;
        this.liverDisease = liverDisease;
        this.none = none;
        this.occupation = occupation;
        this.otherOccupation = otherOccupation;
        this.contactWithCOVIDCase = contactWithCOVIDCase;
        this.typeOfSampleCollected = typeOfSampleCollected;
        this.nameOfSampleCollectionCenter = nameOfSampleCollectionCenter;
        this.dateOfSampleCollection = dateOfSampleCollection;
        this.sentToLab = sentToLab;
        this.result = result;
        this.dateOfLabResult = dateOfLabResult;
        this.hospitalization = hospitalization;
        this.dateOfHospitalization = dateOfHospitalization;
        this.iCUAdmission = iCUAdmission;
        this.dateOfICUAdmission = dateOfICUAdmission;
        this.admittedIn = admittedIn;
        this.treatingPhysician = treatingPhysician;
        this.results = results;
    }




}
