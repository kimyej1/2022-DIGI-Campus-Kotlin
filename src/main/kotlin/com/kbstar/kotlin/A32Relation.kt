package com.kbstar.kotlin

// is a, has a

// 서로 객체(상대방)를 참조하는 "양방향 참조"
// 각각의 생명주기에 영향을 주지 않을 때, "연관 관계"라고 한다.
class Patient(val name:String)
{
    fun doctorList(d:Doctor)
    {
        println("Patient : $name, Doctor: ${d.name}")
    }
}

class Doctor(val name:String)
{
    fun patientList(p:Patient)
    {
        println("Doctor : $name, Patient: ${p.name}")
    }
}

// 의존관계
// Patient 객체가 먼저 만들어져 있어야 Doctor를 생성할 수 있는 경우
class PatientOne(val name:String, val id:Int)
{
    fun doctorList(d:DoctorOne)
    {
        println("Patient : $name, Doctor: ${d.name}")
    }
}

class DoctorOne(val name:String, val p:PatientOne)
{
    val pId :Int = p.id
    fun patientList(p:PatientOne)
    {
        println("Doctor : $name, Patient: ${p.name}, pId = ${pId}")
    }
}

fun main() {
    val doc = Doctor("Dr.Kim")
    val pat = Patient("HongKilDong")

    doc.patientList(pat)
    pat.doctorList(doc)

    val p1 = PatientOne("LeeSoonShin", 1234)
    val d1 = DoctorOne("Dr.KB", p1)

    p1.doctorList(d1)
    d1.patientList(p1)
}

