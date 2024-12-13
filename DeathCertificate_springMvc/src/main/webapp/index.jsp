<!DOCTYPE html>
<html>
<head>
    <title>Death Certificate</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h2 class="text-center mb-4">Death Certificate Form</h2>
        <form action="index" method="post" class="needs-validation" novalidate>
            <div class="mb-3">
                <label for="name" class="form-label">Name</label>
                <input type="text" id="name" name="name" class="form-control" placeholder="Enter Name" required>
                <div class="invalid-feedback">Please enter the name.</div>
            </div>

            <div class="mb-3">
                <label for="age" class="form-label">Age</label>
                <input type="number" id="age" name="age" class="form-control" placeholder="Enter Age" required>
                <div class="invalid-feedback">Please enter the age.</div>
            </div>

            <div class="mb-3">
                <label for="address" class="form-label">Address</label>
                <input type="text" id="address" name="address" class="form-control" placeholder="Enter Address" required>
                <div class="invalid-feedback">Please enter the address.</div>
            </div>

            <div class="mb-3">
                <label for="dob" class="form-label">Date of Birth</label>
                <input type="date" id="dob" name="dob" class="form-control" required>
                <div class="invalid-feedback">Please enter the date of birth.</div>
            </div>

            <div class="mb-3">
                <label for="dod" class="form-label">Date of Death</label>
                <input type="date" id="dod" name="dod" class="form-control" required>
                <div class="invalid-feedback">Please enter the date of death.</div>
            </div>

            <div class="mb-3">
                <label for="cause" class="form-label">Cause of Death</label>
                <input type="text" id="cause" name="cause" class="form-control" placeholder="Enter Cause of Death" required>
                <div class="invalid-feedback">Please enter the cause of death.</div>
            </div>

            <button type="submit" class="btn btn-primary w-100">Submit</button>
        </form>
    </div>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
    <script>
        // Bootstrap validation
        (() => {
            'use strict'

            const forms = document.querySelectorAll('.needs-validation')

            Array.from(forms).forEach(form => {
                form.addEventListener('submit', event => {
                    if (!form.checkValidity()) {
                        event.preventDefault()
                        event.stopPropagation()
                    }

                    form.classList.add('was-validated')
                }, false)
            })
        })()
    </script>
</body>
</html>
